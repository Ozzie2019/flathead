import eu.mihosoft.vrl.v3d.CSG
import eu.mihosoft.vrl.v3d.Parabola
double radius= 50
double hullRad= radius*2/5
double radiusMiddle= radius
double moveEnd = radius*4
double moveMiddle = radius*2
double hight = radius*6
double endhight = radius*5
CSG baseCone= Parabola.cone(radius, endhight)
CSG baseConeMoved = baseCone.movex(moveEnd)
CSG middleCone = Parabola.cone(radiusMiddle, hight)
CSG middleConeMoved = middleCone.movex(moveMiddle)
CSG banana = baseCone.union([baseConeMoved,middleConeMoved])
CSG connect = Parabola.cone(hullRad, endhight)
CSG connectMove = connect.movex(moveEnd)
CSG connectHull = CSG.hullAll([connect,connectMove])
return [banana,connectHull]
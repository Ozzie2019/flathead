import eu.mihosoft.vrl.v3d.Parabola

CSG baseCone= Parabola.cone(10, 20)
CSG baseConeMoved = baseCone.movex(20)

return [baseCone,baseConeMoved]
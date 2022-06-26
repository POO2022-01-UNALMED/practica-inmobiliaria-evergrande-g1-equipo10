from Ciudad import Ciudad

class UnidadResidencial(Ciudad):
  UNIDADES = []
  def __init__(self, idUnidadResidencial, nombre, barrio):
    self.idUnidadResidencial = idUnidadResidencial
    self.nombre = nombre
    self.barrio = barrio
    UnidadResidencial.UNIDADES.append(self)
  
  def getUnidades():
    return UnidadResidencial.UNIDADES
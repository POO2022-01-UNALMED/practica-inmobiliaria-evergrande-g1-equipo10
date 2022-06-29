'''
Autores: 
Julián Orozco Vanegas
Juan Nicolas Piedrahita Salas
David Escobar Ruiz

Esta clase simula el comportamiento de una unidad residencial y sus caracteristicas generales
'''

from .Ciudad import Ciudad

class UnidadResidencial(Ciudad):
  UNIDADES = []
  def __init__(self, idUnidadResidencial, nombre, barrio):
    self.idUnidadResidencial = idUnidadResidencial
    self.nombre = nombre
    self.barrio = barrio
    UnidadResidencial.UNIDADES.append(self)
  
  @classmethod
  def getUnidades(cls):
    return UnidadResidencial.UNIDADES
  
  def getIdUnidadResidencial(self):
    return self.idUnidadResidencial
  
  def getNombre(self):
    return self.nombre
  
  def getBarrio(self):
    return self.barrio
  
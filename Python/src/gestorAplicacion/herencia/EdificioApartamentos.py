'''
Autores: 
Julián Orozco Vanegas
Juan Nicolas Piedrahita Salas
David Escobar Ruiz

Esta clase simula el comportamiento de una unidad residencial de tipo edificio de apartamentos y sus caracteristicas
'''

from gestorAplicacion.otros.UnidadResidencial import UnidadResidencial

class EdificioApartamentos(UnidadResidencial):
  def __init__(self, idUnidadResidencial, nombre, barrio, numero_pisos):
    super().__init__(idUnidadResidencial, nombre, barrio)
    self.numero_pisos = numero_pisos

  def presentarInforme(self):
    " Nombre del edificio: " + super().getNombre() + "\n" + " Identificado con el id: " + str(super().getIdUnidadResidencial()) + "\n" + " Ubicado en el barrio: " + super().getBarrio() + " en la ciudad de Medellin, cuyo alcalde es "+ super().ALCALDE + " y actualmente presenta un IVA del "+ str(super().IVA) + "\n" +	" Con " + str(self.getNumero_pisos()) + " pisos de altura"
  
  def getNumero_pisos(self):
    return self.numero_pisos
  
  def setNumero_pisos(self, nNumeroPisos):
    self.numero_pisos = nNumeroPisos
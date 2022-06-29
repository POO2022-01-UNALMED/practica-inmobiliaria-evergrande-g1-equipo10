'''
Autores: 
Julián Orozco Vanegas
Juan Nicolas Piedrahita Salas
David Escobar Ruiz

Esta clase simula el comportamiento de una unidad residencial de tipo cerrada y sus caracteristicas
'''

from gestorAplicacion.otros.UnidadResidencial import UnidadResidencial

class UnidadCerrada(UnidadResidencial):
  def __init__(self, idUnidadResidencial, nombre, barrio, numero_torres):
    super().__init__(idUnidadResidencial, nombre, barrio)
    self.numero_torres = numero_torres

  def presentarInforme(self):
    return "UNIDAD CERRADA\n" + " Nombre de la Unidad: " + super().getNombre() + "\n" + " Identificada con el id: " + str(super().getIdUnidadResidencial()) + "\n" + " Ubicada en el barrio " + super().getBarrio() + " en la ciudad de Medellin, cuyo alcalde es "+ super().ALCALDE + " y actualmente presenta un IVA del "+ str(super().IVA) + "\n" + " Con " + str(self.getNumero_torres()) + " torres" + "\n"
  
  def getNumero_torres(self):
    return self.numero_torres
  
  def setNumero_torres(self, nNumero_torres):
    self.numero_torres = nNumero_torres
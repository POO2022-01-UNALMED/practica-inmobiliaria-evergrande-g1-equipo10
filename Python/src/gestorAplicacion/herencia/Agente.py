from Persona import Persona

class Agente(Persona):
  AGENTES = []

  def __init__(self, cedula, nombreCompleto, telefonoFijo, telefonoCelular, vehiculo, placaVehiculo):
    super().__init__(cedula, nombreCompleto, telefonoFijo, telefonoCelular)
    self.vehiculo = vehiculo
    self.placaVehiculo = placaVehiculo
  
  def getVehiculo(self):
    return self.vehiculo
  
  def setVehiculo(self, nVehiculo):
    self.vehiculo = nVehiculo
  
  def getPlaca(self):
    return self.placa
  
  def setPlaca(self, nPlaca):
    self.placa = nPlaca


  # def buscarAgente(self, id)

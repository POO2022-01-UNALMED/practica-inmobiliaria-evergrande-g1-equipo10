from gestorAplicacion.otros.Persona import Persona

class Agente(Persona):
  _agentes = []

  def __init__(self, cedula, nombreCompleto, telefonoFijo, telefonoCelular, vehiculo, placaVehiculo):
    super().__init__(cedula, nombreCompleto, telefonoFijo, telefonoCelular)
    self._vehiculo = vehiculo
    self._placaVehiculo = placaVehiculo

    Agente._AGENTES.append(self)
  
  def getVehiculo(self):
    return self._vehiculo
  
  def setVehiculo(self, nVehiculo):
    self._vehiculo = nVehiculo
  
  def getPlacaVehiculo(self):
    return self._placaVehiculo
  
  def setPlacaVehiculo(self, nPlaca):
    self._placaVehiculo = nPlaca

  @classmethod
  def existeAgente(cls, ced):
    return len(list(filter(lambda agente: agente.cedula == ced, cls._AGENTES))) > 0

  @classmethod
  def setAgente(cls, agentes):
    cls._AGENTES = agentes

  @classmethod
  def getAgente(cls):
    return cls._AGENTES

  
  def buscarAgente(cedula):
    agentes_busqueda = []
    for agente in Agente._agentes:
      if agente.getCedula() == cedula:
        agentes_busqueda.append(agente.getCedula())
    return agentes_busqueda

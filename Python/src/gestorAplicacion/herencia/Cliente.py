from Persona import Persona
class Cliente(Persona):
  def __init__(self, cedula, nombreCompleto, telefonoFijo, telefonoCelular):
    super().__init__(cedula, nombreCompleto, telefonoFijo, telefonoCelular)
    self.inmuebles = []
    self.citas = []
  
  def getInmuebles(self):
    return self.inmuebles
  
  def setInmuebles(self, nInmuebles):
    self.inmuebles = nInmuebles
  
  def getCitas(self):
    return self.citas
  
  def setCitas(self, nCitas):
    self.citas = nCitas

  # def comprarInmueble(self, inmueble):
  # def pedirCita(self, )
  # def cancelarCita(self, )
  # def iniciarContrato(self, inmueble)
  # def finalizarContrato(self, inmueble)
  # def realizarPago(self, )





  def listarInmuebles(self):
    return self.inmuebles

# Cliente(1, "nombreCompleto", 1234567, 1234567890)
from .Persona import Persona
from gestorAplicacion.herencia.Inmueble import Inmueble
from .TipoContrato import TipoContrato
from .Cita import Cita
from .Pago import Pago

class Cliente(Persona):
  _cliente = None
  def __init__(self, cedula, nombreCompleto, telefonoFijo, telefonoCelular):
    super().__init__(cedula, nombreCompleto, telefonoFijo, telefonoCelular)
    self.inmuebles = []
    self.citas = []
  
  @classmethod
  def setCliente(cls,cliente):
    cls._cliente = cliente
    
  def getInmuebles(self):
    return self.inmuebles
  
  def setInmuebles(self, nInmuebles):
    self.inmuebles = nInmuebles
  
  def getCitas(self):
    return self.citas
  
  def setCitas(self, nCitas):
    self.citas = nCitas

  def comprarInmueble(self, idInmueble):
    inmuebleComprar = Inmueble.buscarInmueble(idInmueble)
    if inmuebleComprar.getTipoContrato() == TipoContrato.VENTA:
      inmuebleComprar.setVendido(True)
      self.inmuebles.append(idInmueble)

  def pedirCita(self, ano, mes, dia, hora, idAgente, idInmueble):
    cita = Cita(ano, mes, dia, hora, idAgente, idInmueble)
    idCita = cita.getIdCita()
    self.citas.append(idCita)
    print("\nNueva cita programada para las "+ cita.getHora() +" del dia "+ cita.getDia() + ", mes "+cita.getMes() + ", ano " + cita.getAno() + ". Con el agente con cedula " + cita.getIdAgente() +" para la visita del inmueble con id "+ cita.getIdInmueble())
    return cita

  def cancelarCita(self, cita):
    Cita.cancelar(cita)
  
  def iniciarContrato(self, idInmueble):
    inmuebleArrendar = Inmueble.buscarInmueble(idInmueble)
    if inmuebleArrendar.getTipoContrato() == TipoContrato.ARRIENDO:
      inmuebleArrendar.setArrendado(True)
      self.inmuebles.append(idInmueble)

  def finalizarContrato(self, idInmueble):
    if Inmueble.buscarInmueble(idInmueble).getTipoContrato() == TipoContrato.ARRIENDO:
      for i in range(0, len(self.inmuebles)):
        if (self.inmuebles)[i] == idInmueble:
          del (self.inmuebles)[i]
          break
  
  def realizarPago(self, valor, ano, mes, idInmueble):
    return Pago(valor, ano, mes, idInmueble)

  def listarInmuebles(self):
    return self.inmuebles
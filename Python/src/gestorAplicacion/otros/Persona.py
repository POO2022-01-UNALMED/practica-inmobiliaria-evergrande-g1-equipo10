'''
Autores: 
Julián Orozco Vanegas
Juan Nicolas Piedrahita Salas
David Escobar Ruiz

Esta clase simula el comportamiento de una persona y sus caracteristicas generales
'''

class Persona:
  def __init__(self, cedula, nombreCompleto, telefonoFijo, telefonoCelular):
    self.cedula = cedula
    self.nombreCompleto = nombreCompleto
    self.telefonoFijo = telefonoFijo
    self.telefonoCelular = telefonoCelular

  def getCedula(self):
    return self.cedula

  def setCedula(self, nCedula):
    self.cedula = nCedula  

  def getNombreCompleto(self):
    return self.nombreCompleto
  
  def setNombreCompleto(self, nNombreCompleto):
    self.nombreCompleto = nNombreCompleto
  
  def getTelefonoFijo(self):
    return self.telefonoFijo
  
  def setTelefonoFijo(self, nTelefonoFijo):
    self.telefonoFijo = nTelefonoFijo
  
  def getTelefonoCelular(self):
    return self.telefonoCelular
  
  def setTelefonoCelular(self, nTelefonoCelular):
    self.telefonoCelular = nTelefonoCelular
  
  def listarInmuebles(self):
    return None
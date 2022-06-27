
import tkinter as tk

from baseDatos.serializador import Serializador
from uiMain.Inicio import Inicio
from uiMain.ventaUsuarioPrueba import Prueba

# Cita
from gestorAplicacion.otros.Cita import Cita
Cita.setCitas(Serializador.deserializar("Cita"))

#Inmueble
from gestorAplicacion.herencia.Inmueble import Inmueble
Inmueble.setInmuebles(Serializador.deserializar("Inmueble"))

#Pago
from gestorAplicacion.otros.Pago import Pago
Pago._pagos = Serializador.deserializar("Pago")

#Agente 
from gestorAplicacion.otros.Agente import Agente
Agente.setAgente(Serializador.deserializar("Agente"))

#Cliente
from gestorAplicacion.otros.Cliente import Cliente
Cliente.setCliente(Serializador.deserializar("Cliente"))

Inicio()
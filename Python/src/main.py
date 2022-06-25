import tkinter as tk

from baseDatos.serializador import Serializador
from uiMain.Inicio import Inicio
from uiMain.Plantilla import Plantilla

# Cita
from gestorAplicacion.otros.Cita import Cita
from uiMain.gestionarCitas.verCitas import verCitas

Cita.setCitas(Serializador.deserializar("Cita"))

# Inicio()

verCitas()
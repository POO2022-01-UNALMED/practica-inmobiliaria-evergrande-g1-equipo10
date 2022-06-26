from .ErrorAplicacion import ErrorAplicacion

# clase de errores asociadas a los entry o cualquier entrada de un formulario del sistema
class FieldException(ErrorAplicacion):
    def __init__(self, mensaje):
        super().__init__(mensaje)
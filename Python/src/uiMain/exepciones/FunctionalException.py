from .ErrorAplicacion import ErrorAplicacion

# clase de error asociada a errores asociados al negocio que se modela en la aplicacion (ej: un inmueble vendido que ya fue pagado, y se intenta volver a pagarlo)
class FunctionalException(ErrorAplicacion):

    def __init__(self, mensaje):
        super().__init__(mensaje)
from UnidadResidencial import UnidadResidencial

class UnidadCerrada(UnidadResidencial):
  def __init__(self, idUnidadResidencial, nombre, barrio, numero_torres):
    super().__init__(idUnidadResidencial, nombre, barrio)
    self.numero_torres = numero_torres

from UnidadResidencial import UnidadResidencial

class EdificioApartamentos(UnidadResidencial):
  def __init__(self, idUnidadResidencial, nombre, barrio, numero_pisos):
    super().__init__(idUnidadResidencial, nombre, barrio)
    self.numero_pisos = numero_pisos

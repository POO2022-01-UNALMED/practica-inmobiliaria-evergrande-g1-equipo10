from .Inmueble import Inmueble

class Bodega(Inmueble):
    def __init__(self, precio, direccion, area, numPisos, parqueaderoCarros, parquederoMotos, amueblado, tipoContrato, idUnidad, capacidad, oficina, bano):
        super().__init__(precio, direccion, area, numPisos, parqueaderoCarros, parquederoMotos, amueblado, tipoContrato, idUnidad)
        self._capacidad = capacidad
        self._oficina = oficina
        self._bano = bano
    
    #toString
    def __str__(self):
        return "| {:<4d} | {:<13s} | {:<14f} | {:<15s} | {:<6f} | {:<11s} | {:<19s} | {:<17s} | {:<20s} | {:<9d} | {:<8d} | {:<7d} |".format(self.getIdInmueble(),
                                                                                                                                            type(self).__name__,
                                                                                                                                            self.getPrecio(), 
                                                                                                                                            self.getTipoContrato(),
                                                                                                                                            self.getArea(),
                                                                                                                                            self.getAmueblado(),
                                                                                                                                            self.getParqueaderoCarros(),
                                                                                                                                            self.getParqueaderoMotos(),
                                                                                                                                            self.getDireccion(),
                                                                                                                                            self.getCapacidad(),
                                                                                                                                            self.getOficina(),
                                                                                                                                            self.getBano())
    #getters and setters 
    def getCapacidad(self):
        return self._capacidad
    
    def setCapacidad(self,capacidad):
        self._capacidad = capacidad
        
    def getOficina(self):
        return self._oficina
    
    def setOficina(self,oficina):
        self._oficina = oficina
        
    def getBano(self):
        return self._bano 
    
    def setBano(self, bano):
        self._bano = bano
    
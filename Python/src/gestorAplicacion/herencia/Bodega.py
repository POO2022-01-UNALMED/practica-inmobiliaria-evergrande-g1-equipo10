from Inmueble import Inmueble

class Bodega(Inmueble):
    def __init__(self, precio, direccion, area, numPisos, parqueaderoCarros, parquederoMotos, amueblado, tipoContrato, idUnidad, capacidad, oficina, bano):
        super().__init__(precio, direccion, area, numPisos, parqueaderoCarros, parquederoMotos, amueblado, tipoContrato, idUnidad)
        self._capacidad = capacidad
        self._oficina = oficina
        self._bano = bano
        
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
    
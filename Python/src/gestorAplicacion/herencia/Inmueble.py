'''
Autores: 
Julián Orozco Vanegas
Juan Nicolas Piedrahita Salas
David Escobar Ruiz

Esta clase simula el comportamiento de un inmueble y sus caracteristicas
'''

class Inmueble():
    _totalInmuebles = 0
    _inmuebles = []

    def __init__(self, precio, direccion, area, numPisos, parqueaderoCarros, parquederoMotos, amueblado,tipoContrato,idUnidad):
        self._precio = precio
        self._direccion = direccion
        self._area = area
        self._numPisos = numPisos
        self._parqueaderoCarros = parqueaderoCarros
        self._parqueaderoMotos = parquederoMotos
        self._amueblado = amueblado
        self._tipoContarto = tipoContrato
        self._idUnidadResidencial = idUnidad

        self._idInmueble = Inmueble._totalInmuebles
        Inmueble._totalInmuebles += 1

        self._vendido = False
        self._arrendado = False
        Inmueble.agregarInmueble(self)

    @classmethod
    def agregarInmueble(cls, inmueble):
        cls._inmuebles.append(inmueble)
        
    
    #Método pra buscar un grupo de inmuebles por sus id
    @classmethod
    def buscarInmueblesLista(cls,idImueble):
        listaInmuebles = []
        for id in idImueble:
            for inmueble in cls._inmuebles:
                if inmueble.getIdInmueble() == id:
                    listaInmuebles.append(inmueble)
                
        return listaInmuebles
    
    #Metodo para buscar un inmueble por su id
    @classmethod
    def buscarInmueble(cls,idInmueble):
        if isinstance(idInmueble, list):
            return cls.buscarImueblesLista(idInmueble)
        
        for inmueble in cls._inmuebles:
            if inmueble.getIdInmueble() == idInmueble:
                return inmueble
        
        return None

    @classmethod
    def existeInmueble(self, idInmueble):
        return self.buscarInmueble(idInmueble) != None
    
    #ToString
    def __str__(self):
        return "| {:<4d} | {:<13s} | {:<14f} | {:<15s} | {:<9f} | {:<11s} | {:<19s} | {:<17s} | {:<20s} |".format(self.getIdInmueble(), 
                                                                                                                    type(self).__name__, 
                                                                                                                    self.getPrecio(),
                                                                                                                    self.getTipoContrato(),
                                                                                                                    self.getArea(),
                                                                                                                    self.getAmueblado(),
                                                                                                                    self.getParqueaderoCarros(),
                                                                                                                    self.getParqueaderoMotos(),
                                                                                                                    self.getDireccion())
            
            
    #Getters and Setters de atributos de clase
    @classmethod
    def getTotalInmuebles(cls):
        return cls._totalInmuebles
    
    @classmethod
    def setTotalInmuebles(cls, total):
        cls._totalInmuebles = total
        
    @classmethod
    def getInmuebles(cls):
        return cls._inmuebles
    
    @classmethod
    def setInmuebles(cls,inmuebles):
        cls._inmuebles = inmuebles
        
        
    #Getters and Setters de atributos de instancia
    def getIdInmueble(self):
        return self._idInmueble
    
    def setIdInmueble(self,id):
        self._idInmueble = id
        
    def getPrecio(self):
        return self._precio
    
    def setPrecio(self,precio):
        self._precio = precio
        
    def getDireccion(self):
        return self._direccion
    
    def setDireccion(self,direccion):
        self._direccion = direccion
        
    def getArea(self):
        return self._area
    
    def setArea(self,area):
        self._area = area
        
    def getNumPisos(self):
        return self._numPisos
    
    def setNumPisos(self, pisos):
        self._numPisos = pisos
        
    def getParqueaderoCarros(self):
        return self._parqueaderoCarros
    
    def setParqueaderoCarros(self, parqueaderoCarros):
        self._parqueaderoCarros = parqueaderoCarros
        
    def getParqueaderoMotos(self):
            return self._parqueaderoMotos
    
    def setParqueaderoMotos(self, parqueaderoMotos):
        self._parqueaderoMotos = parqueaderoMotos
        
    def getAmueblado(self):
        return self._amueblado
    
    def setAmueblado(self,amueblado):
        self._amueblado = amueblado
        
    def getTipoContrato(self):
        return self._tipoContarto.value
    
    def setTipoContrato(self,tipo):
        self._tipoContarto = tipo
        
    def getIdUnidadResidencial(self):
        return self._idUnidadResidencial
    
    def setIdUnidadResidencial(self,id):
        self._idUnidadResidencial = id
        
    def getVendido(self):
        return self._vendido
    
    def setVendido(self, isVendido):
        self._vendido = isVendido
    
    def getArrendado(self):
        return self._arrendado
    
    def setArrendado(self, isArrendado):
        self._arrendado = isArrendado   
    


from gestorAplicacion.otros.Cliente import Cliente
from gestorAplicacion.otros.Pago import Pago
from gestorAplicacion.otros.Cita import Cita
from gestorAplicacion.herencia.Inmueble import Inmueble
from gestorAplicacion.herencia.ApartaEstudio import ApartaEstudio
from gestorAplicacion.herencia.Apartamento import Apartamento
from gestorAplicacion.herencia.Bodega import Bodega
from gestorAplicacion.herencia.Casa import Casa
from gestorAplicacion.otros.TipoContrato import TipoContrato
from gestorAplicacion.otros.Vehiculo import Vehiculo
from gestorAplicacion.otros.Agente import Agente
from baseDatos.serializador import Serializador

if __name__ == "__main__":
    pagos = [
        Pago(10,2022,6,1)
    ]

    Serializador.serializar(pagos, "Pago")

    agentes = [
        Agente(123456, "sancho panza", 5555, 8888, Vehiculo.CARRO, "ABC123"),
        Agente(654321, "trotski", 111, 2211, Vehiculo.MOTO, "GBD87T")
    ]

    Serializador.serializar(agentes, "Agente")

    citas = [
        Cita(22, 6, 2022, 4, 123456, 1),
        Cita(1, 6, 2022, 4, 654321, 1),
    ]

    Serializador.serializar(citas, "Cita")
    
    inmuebles = [
        Inmueble(10000,"cll 2 #49-15", 60,1,True,False,True, TipoContrato.ARRIENDO, 1),
        Casa(50000, "crr 6 #5a", 80, 2, False, False, False, TipoContrato.VENTA, 2, 2, 1, 0, 1),
        ApartaEstudio(200000, "cll 2 #49-15", 100, 1, True, True, False, TipoContrato.VENTA, 1, "Unidad 1", 3,201,4,2 ),
        Apartamento(4000000, "crr 6 #5a", 90, 1, True, False, True, TipoContrato.ARRIENDO, 2, "Unidad 2", 5, 503, 3, 2, 1, 2),
        Bodega(15000,"cll 2 #49-15", 500, 1, False, False, False, TipoContrato.VENTA, 1, 200, 2, 1)
    ]
    
    #Inmuebles del cliente
    inmuebles[0].setArrendado(True)
    inmuebles[1].setVendido(True)
    inmuebles[2].setVendido(True)
    
    Serializador.serializar(inmuebles, "Inmueble")
    
    clientes = [Cliente(1, "Pepe Pérez", 51368436,813686952)]
    
    #Inmuebles del cliente 
    clientes[0].setInmuebles([0,1,2])
    
    Serializador.serializar(clientes, "Cliente")

from gestorAplicacion.otros.Pago import Pago
from baseDatos.serializador import Serializador

if __name__ == "__main__":
    pagos = [
        Pago(10,2022,6,1)
    ]

    Serializador.serializar(pagos, "Pago")

    pagos2 = Serializador.deserializar("Pago")

    print(pagos2[0].getValor())
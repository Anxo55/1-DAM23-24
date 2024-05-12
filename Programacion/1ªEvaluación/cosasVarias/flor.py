import turtle
import time

# Configuración inicial
t = turtle.Turtle()
t.speed(0)  # Configura la velocidad máxima
turtle.bgcolor("black")  # Configura el fondo blanco

# Función para dibujar un pétalo
def draw_petal():
    t.color("yellow")  # Color de pétalo amarillo
    t.begin_fill()
    t.circle(50, 60)  # Dibuja un arco de 60 grados
    t.left(120)  # Gira 120 grados a la izquierda
    t.circle(50, 60)  # Dibuja otro arco de 60 grados
    t.end_fill()

# Dibuja la flor con pétalos unidos
for _ in range(6):
    draw_petal()
    t.left(60)  # Gira 60 grados a la izquierda para el siguiente pétalo
    time.sleep(1)  # Espera 1 segundo entre cada pétalo

# Dibuja el centro de la flor
t.penup()
t.goto(0, 0)
t.pendown()
t.color("yellow")
t.begin_fill()
t.circle(20)
t.end_fill()

# Cierra la ventana al hacer clic
turtle.exitonclick()
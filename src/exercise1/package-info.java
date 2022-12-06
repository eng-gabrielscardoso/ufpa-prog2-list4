package exercise1;

/*
Escreva a classe ObjetoGeometrico que represente um objeto geométrico em duas
dimensões. Esta classe deve ter métodos para inicializar o objeto, mostrar seus dados e
calcular e retornar a sua área e perímetro. Usando esta classe como base, escreva as
classes herdeiras Circulo (contendo duas coordenadas para o centro e um raio),
Retangulo (contendo dois valores para os lados) e Triangulo (contendo três valores para
os lados), que sobrepõem os métodos descritos em ObjetoGeometrico. Dicas: a área de
um círculo pode ser calculada com Math.PI*r*r, onde r é o raio do círculo. O perímetro
de um círculo é dado por 2*Math.PI*r. A área do retângulo é dada por b*h onde b é um
dos lados e h é o outro lado. Seu perímetro é dado por 2*b+2*h. A área de um triângulo
é dada por Math.sqrt(s*(s-a)*(s-b)*(s-c)) onde Math.sqrt é a função que calcula a raiz
quadrada, a, b e c são os lados do triângulo e s é a metade do perímetro do triângulo. O
perímetro do triângulo é calculado como (a+b+c). Apresentar o diagrama UML, Fazer
instâncias das classes herdeiras na classe principal, apresentando como saída áreas e
perímetros dos objetos geométricos.
*/
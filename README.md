# desafio-dio-POO

Este é um desafio proposto no bootcamp Banco Pan Java Developer, da Digital Innovation One. O objetivo é desenvolver um sistema que gerencie a inscrição e progresso de estudantes em conteúdos educacionais (cursos, mentoria e bootcamps) e calcule a quantidade de XP adquirida por cada estudante.

## Descrição das classes

### Main
A classe Main é a classe principal que cria instâncias de todas as outras classes e demonstra como elas podem ser usadas em conjunto. A classe Main cria instâncias de Curso, Mentoria e Bootcamp, inscreve instâncias de Dev nesses conteúdos e demonstra como os métodos de Dev podem ser usados para progredir nesses conteúdos e calcular o XP total do desenvolvedor.

### Bootcamp
A classe Bootcamp representa um programa de ensino que contém uma lista de conteúdos, como cursos e mentorias. Cada instância de Bootcamp possui um nome e uma descrição, além dos conteúdos associados a ele. A classe Bootcamp também tem um método para adicionar conteúdos à lista de conteúdos.

### Conteudo
A classe abstrata Conteudo representa um conteúdo genérico, como um curso ou uma mentoria, que tem um título e uma descrição. A classe Conteudo tem um método abstrato calcularXp() que retorna o valor de experiência (XP) associado a esse conteúdo.

### Curso
A classe Curso é uma subclasse de Conteudo que representa um curso específico. Cada instância de Curso tem uma carga horária associada e um valor padrão de XP.

### Dev
A classe Dev representa um desenvolvedor. Cada instância de Dev tem um nome e uma lista de conteúdos aos quais está inscrito e seu progresso em cada um desses conteúdos. A classe Dev tem métodos para inscrever-se em conteúdos, progredir nesses conteúdos e calcular o XP total do desenvolvedor.

### Mentoria
A classe Mentoria é uma subclasse de Conteudo que representa uma mentoria específica. Cada instância de Mentoria tem uma data e um valor padrão de XP.



# Tecnologias utilizadas
Java 11
IDE IntelliJ

# Autor
Autor: Gabriel Amigo

LinkedIn: https://www.linkedin.com/in/gabriel-amigo-b80594166/

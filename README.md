<h1 align="center">🎶 ONEmusic 🎶</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
  <img src="https://img.shields.io/badge/Status-Concluído-brightgreen?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Curso-POO%20ONE-blueviolet?style=for-the-badge"/>
</p>

<p align="center">
  <i>Projeto desenvolvido como parte do curso de Programação Orientada a Objetos da ONE (Oracle Next Education).</i>
</p>

---

## 🧠 Sobre o projeto

**ONEmusic** é um reprodutor de áudio simples desenvolvido em **Java**, que simula a execução de **músicas** e **podcasts**, registrando o número de reproduções, curtidas e gerando uma **classificação automática** com base nesses dados.

O projeto foi criado para praticar os principais **conceitos de POO (Programação Orientada a Objetos)**, como:
- Herança 👨‍👩‍👧‍👦  
- Encapsulamento 🔒  
- Polimorfismo 🌀  
- Sobrescrita de métodos 📝  

---

## 🧩 Estrutura do Projeto

ONEmusic/
├── src/
│ ├── principal/
│ │ └── Main.java
│ └── modelos/
│ ├── Audio.java
│ ├── Musica.java
│ ├── Podcast.java
│ └── MinhasPreferidas.java
└── README.md

yaml
Copiar código

### 📂 Pacote `modelos`
Contém as classes principais:
- **Audio** → Classe base para todos os tipos de áudio.  
- **Musica** → Subclasse de `Audio`, com atributos de artista, álbum e gênero.  
- **Podcast** → Subclasse de `Audio`, com atributos de apresentador e descrição.  
- **MinhasPreferidas** → Classe auxiliar para gerenciar os áudios preferidos.

### 🖥️ Pacote `principal`
- **Main.java** → Executa o programa simulando a reprodução e curtidas em músicas e podcasts.

---

## ⚙️ Funcionalidades

✅ Registrar reproduções e curtidas  
✅ Exibir ficha técnica das mídias  
✅ Calcular **classificação automática** com base no engajamento  
✅ Listar conteúdos adicionados às “Minhas Preferidas”  
✅ Utilizar herança e polimorfismo para generalizar comportamentos  

---

## 🧮 Regras de Classificação

- 🎵 **Músicas**
  - Se total de reproduções ≥ **2000** → ⭐ classificação = **10**
  - Caso contrário → ⭐ classificação = **8**

- 🎙️ **Podcasts**
  - Se curtidas > **500** → ⭐ classificação = **10**
  - Caso contrário → ⭐ classificação = **8**

---

## 🧰 Tecnologias Utilizadas

- **Linguagem:** Java ☕  
- **Paradigma:** Programação Orientada a Objetos  
- **IDE:** IntelliJ IDEA (ou compatível)  
- **Versão:** Java 17+ recomendada  

---

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/milipedia/ONEmusic.git
Abra o projeto em sua IDE Java (ex: IntelliJ, Eclipse ou VSCode).

Localize e execute o arquivo Main.java.

Observe a saída no terminal mostrando as informações de cada áudio, reproduções e classificações.

🧠 Exemplo de Uso
java
Copiar código
Musica musica = new Musica();
musica.setTitulo("505");
musica.setArtista("Arctic Monkeys");

for (int i = 0; i < 5000; i++) {
    musica.reproduzir();
}
for (int i = 0; i < 50; i++) {
    musica.curtir();
}

Podcast podcast = new Podcast();
podcast.setTitulo("Bolha Dev");
podcast.setApresentador("Marcus Mendes");

for (int i = 0; i < 5000; i++) {
    podcast.reproduzir();
}
for (int i = 0; i < 1000; i++) {
    podcast.curtir();
}

MinhasPreferidas preferidas = new MinhasPreferidas();
preferidas.inclui(musica);
preferidas.inclui(podcast);
💡 Ideias Futuras
✨ Adicionar persistência de dados (salvar histórico de áudios)
🎨 Criar uma interface gráfica simples
🌐 Converter o projeto em uma API REST com Spring Boot
📊 Adicionar filtros e ordenação nas preferidas
🎧 Incluir novos tipos de mídia (audiolivros, rádio, etc.)

👩‍💻 Autoria
Projeto desenvolvido por Milipedia 💚
Fazendo parte do curso de Programação Orientada a Objetos - ONE (Oracle Next Education).

“Aprender é evoluir um pouquinho todos os dias.” ☀️

<p align="center"> <img src="https://github.com/milipedia.png" width="100" style="border-radius:50%"> </p>

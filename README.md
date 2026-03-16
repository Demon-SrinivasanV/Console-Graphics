# 🖥️ Console Graphics

A pure-Java ASCII art library that renders large banner-style text and iconic ASCII artwork directly in the terminal — no external dependencies, no libraries, just Java.

Built by **Demon-SrinivasanV** ([@GitHub](https://github.com/Demon-SrinivasanV)).

---

## 📖 Description

`Console_Graphics` is a single-file Java program that brings ASCII art to your console. It contains two main capabilities:

1. **`Console_Graphic(String)`** — Renders any string as large 5-row tall ASCII block letters, supporting the full alphabet (uppercase and lowercase), digits 0–9, and a wide range of symbols including currency signs (₹, £, €, $, ¥), punctuation, and special characters.

2. **Preset ASCII Art Scenes** — A curated collection of detailed ASCII artwork from pop culture, rendered with a smooth loading animation before each piece.

A built-in spinner animation (`Load_Animation`) plays before every render, giving the output a polished, sequential feel.

---

## ✨ Features

- **Full alphabet support** — Uppercase (A–Z) and lowercase (a–z) block letters, each crafted as a 5-row ASCII glyph.
- **Digits & symbols** — Numbers 0–9 and 40+ special characters including `!`, `@`, `#`, `$`, `%`, `^`, `&`, `*`, `(`, `)`, `+`, `=`, `{`, `}`, `[`, `]`, `|`, `\`, `/`, `:`, `;`, `"`, `'`, `<`, `>`, `,`, `.`, `?`, and more.
- **Currency characters** — Dedicated glyphs for ₹, £, €, $, ¢, ¥.
- **Graceful error glyph** — Unsupported characters render as a visible `-x-x-` placeholder instead of silently breaking.
- **Spinner loading animation** — A rotating `[ - ] [ \ ] [ | ] [ / ]` spinner with percentage counter precedes every output.
- **Preset pop culture art** — Ready-to-display ASCII art scenes included out of the box.
- **Zero dependencies** — Uses only `java.io` from the standard library.

---

## 🎨 Included ASCII Art

| Method | Art |
|---|---|
| `Hitman()` | Agent 47 silhouette |
| `Lara_Croft()` | Detailed Lara Croft figure |
| `Mortal_Kombat()` | Mortal Kombat logo/emblem |
| `Imperial_Courier_Elite2()` | Elite Dangerous ship |
| `Quake()` | Quake game artwork |
| `Space_Invaders()` | Classic Space Invaders scene |
| `Pokemon_Logo()` | Pokémon logo |
| `Bulbasaur()` | Bulbasaur ASCII art |
| `Ivysaur()` | Ivysaur ASCII art |
| `Venusaur()` | Venusaur ASCII art |
| `Squirtle()` | Squirtle ASCII art |
| `Charmander()` | Charmander ASCII art |
| `Charmeleon()` | Charmeleon ASCII art |
| `Wartortle()` | Wartortle ASCII art |

---

## 🚀 Installation

### Prerequisites — Install Java

#### Windows
1. Download the JDK from [https://adoptium.net](https://adoptium.net) (recommended: JDK 17 or later).
2. Run the installer and follow the prompts.
3. Verify installation:
   ```
   java -version
   javac -version
   ```

#### macOS
Using Homebrew:
```bash
brew install openjdk
```
Or download from [https://adoptium.net](https://adoptium.net).

Verify:
```bash
java -version
javac -version
```

#### Linux (Debian/Ubuntu)
```bash
sudo apt update
sudo apt install default-jdk
java -version
javac -version
```

#### Linux (Fedora/RHEL)
```bash
sudo dnf install java-17-openjdk-devel
java -version
```

> **Minimum required version:** Java 8 (JDK 1.8) or higher.

---

## ▶️ Usage

### 1. Clone the repository

```bash
git clone https://github.com/CheeniUchiha/Console_Graphics.git
cd Console_Graphics
```

### 2. Compile

```bash
javac Console_Graphics.java
```

### 3. Run

```bash
java Console_Graphics
```

This runs the default `main()` method, which plays through all preset ASCII art scenes and ends with a `Console_Graphic("Hello, World!")` banner.

---

## 🛠️ Using `Console_Graphic` in Your Own Code

To render your own text as large ASCII block letters, call the static method:

```java
Console_Graphics.Console_Graphic("YOUR TEXT HERE");
```

### Examples

**Render a simple word:**
```java
Console_Graphics.Console_Graphic("HELLO");
```

Output (approximate):
```
 _   _ _____  _     _     ___  
| | | | ____|| |   | |   / _ \ 
| |_| |  _|  | |   | |  | | | |
|  _  | |___ | |___| |__| |_| |
|_| |_|_____|_____|_____|\___/ 
```

**Render mixed case with symbols:**
```java
Console_Graphics.Console_Graphic("Java!");
```

**Render a number string:**
```java
Console_Graphics.Console_Graphic("2025");
```

**Display a single preset art piece:**
```java
Console_Graphics.Bulbasaur();
```

**Display all presets in sequence:**
```java
// This is what main() does by default
Console_Graphics.Hitman();
Console_Graphics.Lara_Croft();
Console_Graphics.Pokemon_Logo();
// ...
```

---

## 🔧 Customising

- **Change animation speed:** `Load_Animation(int milliseconds)` — pass a lower value for a faster spinner, higher for slower. Used internally before each render.
- **Add new glyphs:** Each letter/symbol is a static method with a `byte i` parameter (rows 1–5 are the glyph, row 6 is blank padding). Follow the existing pattern to add your own characters.
- **Add new art:** Create a new `public static void MyArt()` method following the pattern of the existing art methods, call `Load_Animation(speed)` at the start, then `System.out.println(yourAsciiArt)`.

---

## 🧩 Use Cases

- **CLI tool splash screens** — Add a stylised banner to your Java command-line applications on startup.
- **Game intros** — Use the preset art or custom text for retro-style console game title screens.
- **Student projects** — Demonstrate Java static methods, string manipulation, and switch-case logic in a visual way.
- **Terminals & kiosks** — Decorate output-only terminal displays with large readable text.
- **Fun / nostalgia** — Relive the era of BBS art and ASCII demos from the 80s and 90s.

---

## 📂 Project Structure

```
Console_Graphics/
└── Console_Graphics.java   # Single-file source — all glyphs, art, and logic
```

---

## 📋 Requirements

| Requirement | Version |
|---|---|
| Java (JDK) | 8 or higher |
| External libraries | None |
| OS | Windows / macOS / Linux |

---

## 📝 License

This project is authored by **CheeniUchiha**. ASCII art pieces are sourced from the community (Art.py, asciiart.eu, and similar). Please credit the original artists where applicable.

---

## 🤝 Contributing

Pull requests are welcome! If you'd like to:
- Add new character glyphs
- Contribute new ASCII art scenes
- Improve the animation or rendering logic

Feel free to fork the repo, make your changes, and open a PR.

---

*Made with ♥ and `System.out.print()`*

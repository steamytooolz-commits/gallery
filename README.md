# 🪐 Elysium Sim Engine

<div align="center">
    <p><b>A highly satirical, self-contained, and dystopian Clinical Simulation & Bureaucratic Sandbox Engine for Android.</b></p>
    <p><i>Roleplay bedside OSCs, formulate healthcare policies in Parliament, defend statutory medical malpractice indictments in the Supreme Medical Tribunal, and navigate an agentic, hyper-capitalist regulatory landscape.</i></p>
</div>

---

## 📖 The Geopolitical Setting: The Sovereign Republic of Elysium
In the sovereign, hyper-bureaucratic state of **Elysium**, the healthcare industry is ruled by strict statutory acts, economic austerity indexes, independent legislative coalitions, and of course, AI senior auditors. 

As a licensed clinical practitioner, your task goes far beyond simple diagnostics. You must keep your patients physically stable, maintain your CPD (Continuing Professional Development) registration points, stay financially solvent under aggressive national insurance tariffs, and avoid getting indicted for medical treason by the **Supreme Medical Court**.

---

## 🛠️ Key Architectural Modules

### 🩺 1. Bedside Clinical OSCE Hub
*   **Dynamic Physiological Telemetry:** Displays core clinical vitals in real-time ($BP$, $HR$, $Temp$ °C, $RR$, and $SpO_2$) keyed to the patient's immediate comfort levels and clinical progression.
*   **Bedside Procedures:** Deploy life-saving interventions (such as supplemental oxygen therapy, IV hydration fluid setup, and diagnostic telemetry lines) which programmatically rewrite both vitals signatures and the patient's emotional disposition.

### 🤖 2. Multi-LLM Patient Conversational Actor
*   **Flexible Client-Side API Routing:** Complete integration with **Google Gemini**, **Anthropic**, and **OpenAI**. Configure response bounds, token limits, history size, or route requests through custom local mock setups.
*   **AIPersona Engine:** The Large Language Model models realistic medical cases, representing the localized symptoms, personal demographics, and emotional volatility of the simulated citizen.

### 🏛️ 3. Sovereign Parliamentary & Policy Simulator
*   **Sovereign Bills Formulation:** Design active clinical bylaws either manually (using precise limits on consultation fees and CPD violation points) or with an AI-directed legislative drafting assistant.
*   **Fay & Coalition Lobbying:** Manage the balance of power inside are 200-seat national legislature split between **The Progressives** (focusing on strict clinical protocols), **The Conservatives** (demanding free-market optimization and reduced operating expenses), and **The Swing Independents** (watching public satisfaction metrics).
*   **Executive Accords:** Send passed drafts to the Executive Head of State to either receive a signature memo (creating a new, active clinical law) or an executive veto containing specific policy rejections.

### ⚖️ 4. Forensic Malpractice Inquests & Tribunals
*   **The Judicial Dock:** Violating active clinical policies or dropping below baseline competence scores triggers a formal inquest in the **Supreme Medical Court**.
*   **Legal Defense & Cross-Examination:** Submit fully hand-written legal arguments justifying your medical deviations. The AI Prosecutor will dismantle your claims in real-time, calling upon judges to impose heavy state fines.
*   **Sub-Rosa Transactions:** When facing severe indictments, wire clandestine offshore payments directly to the Justice's blind trust to lower procedural tension—at risk of triggering anti-corruption audits.

### ⚡ 5. Agentic Overlord Updates
*   Across bedside encounters, court hearings, and parliamentary debates, the AI can programmatically emit an `agentActions` instruction sheet. This lets the model actively rewrite local stats, introduce global news events, modify clinical inventories, freeze practicing licenses, or audit historical clinic records on the fly.

---

## 📦 Technical Architecture & Stack

The application adheres to modern, offline-first Android guidelines utilizing:

-   **Jetpack Compose:** Fully declarative UI utilizing **Material Design 3 (M3)** with custom dynamic dark-slate colorways, dense visual stats cards, and accessibility touch targets.
-   **Model-View-ViewModel (MVVM):** Implemented in `SimulationViewModel` to maintain a robust state flow across complex, non-linear gameplay.
-   **Room SQLite Database:** Stores all historical clinical interactions and OS-level records inside localized SQLite tables safely synced via Moshi JSON Converters.
-   **Jetpack DataStore:** Safely persists and isolates vital API endpoint directories, custom model selections, and user configurations between app boots.
-   **Kotlin Coroutines & Flow:** Manages concurrent multi-LLM rest calls, UI event streams, and real-time news alerts.

---

## 🚀 Easy Local Setup Guide (GitHub-Ready)

Follow these simple steps to import, build, and run the simulation engine locally on Android Studio:

### 📋 Prerequisites
*   [Android Studio (Koala or newer)](https://developer.android.com/studio)
*   Android SDK Platform 34 (configured during initialization)
*   An Android Virtual Device (AVD) or compatible physical hardware running Android O (API 26) or above.

### 🛠️ Execution Checklist

1.  **Clone the Repository**
    ```bash
    git clone https://github.com/your-username/elysium-sim-engine.git
    cd elysium-sim-engine
    ```

2.  **Add Your Environment Secrets**
    Create a private file named `.env` in the root repository folder (we have set up the `.gitignore` to protect this from ever being pushed to public remotes). Inside it, define your Gemini credentials:
    ```ini
    # Root directory /.env file
    GEMINI_API_KEY=your_gemini_api_key_here
    ```

3.  **Open in Android Studio**
    *   Open Android Studio, select **Open**, and navigate to this repository's root folder.
    *   Allow Gradle to automatically download the corresponding plugins, build tools, and dependencies declared in the central `libs.versions.toml` file.

4.  **Synchronize and Run**
    *   Make sure there are no local compilation mismatches.
    *   Wait for the project compilation build to succeed, select your emulator or connected device, and click **Run**.

---

## 📂 Repository Blueprint
```
├── app/
│   ├── src/main/
│   │   ├── AndroidManifest.xml       # Main Android Declarations
│   │   ├── java/com/example/
│   │   │   ├── MainActivity.kt        # Application Entry-Point
│   │   │   ├── data/                 # Database Services, Room Models, DataStore
│   │   │   ├── network/              # Multi-LLM REST API Adapters
│   │   │   └── ui/                   # Jetpack Compose Screens & MVVM ViewModels
│   │   └── res/                      # Values (Strings, Icon definitions)
│   └── build.gradle.kts              # Application Build Configuration
├── gradle/                           # Version Control wrapper files
├── gradle.properties                 # Shared AndroidX properties
├── settings.gradle.kts                # Core Multiproject setup
├── .gitignore                        # Standard Gitignore rules for leaks prevention
└── README.md                         # This Document
```

---

*Disclaimer: This is a satirical work of clinical training fiction. All medical regulations, political factions, судебные outcomes, and legal trials represent fictional elements designed strictly for OSCE and regulatory stress-tests simulation.*

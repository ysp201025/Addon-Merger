# ⚔ MC Addon Merger

A browser-based tool that merges multiple Minecraft Bedrock Edition addons (`.mcaddon` / `.zip`) into a single, error-free addon. No install, no server — everything runs client-side straight from `index.html`.

## ✨ Features

- **Multi-addon merge** — combine any number of Behavior Packs and Resource Packs in one pass
- **Smart JSON merge** — `blocks.json`, `sounds.json`, textures, animations, render_controllers, and geometry (`.geo.json`) files are automatically merged instead of overwritten
- **Script namespacing** — each pack's scripts are isolated under `scripts/<pack_id>/`, so there are zero script conflicts
- **Minecraft version selector** — choose which target version(s) to support (`1.26.0` / `1.26.10` / `1.26.20` / `1.26.30`); `min_engine_version` is calculated automatically from your selection
- **Conflict-safe renaming** — any file with a duplicate name is renamed with its source pack's prefix, so nothing is ever silently overwritten or lost
- **Custom pack icons** — optionally upload a new icon for the merged BP and/or RP (falls back to the original icon if left blank)
- **Live progress + log** — a progress bar and step-by-step log show exactly what's happening during the merge

## 🚀 Usage

1. Open `index.html` in your browser (just double-click it — no server required)
2. **STEP 01 — LOAD ADDONS**: drag & drop, or click to select, the `.mcaddon` / `.zip` files you want to merge
3. **STEP 02 — SETTINGS**: set the output addon name, BP/RP names, and pick the target Minecraft version(s) (optionally upload custom pack icons)
4. **STEP 03 — MERGE & DOWNLOAD**: click "⚗ MERGE INTO .mcaddon" — the merged `.mcaddon` file downloads automatically when it's ready

## 🎮 Minecraft Version Targeting

- Select one or more version chips — at least one must stay selected
- `min_engine_version` is automatically set to the **lowest** version you selected, so the merged addon stays compatible with every selected version and any newer one
- If one of the loaded addons actually requires a higher engine version than what you selected, the tool automatically raises `min_engine_version` to match and shows a ⚠️ warning in the log explaining exactly which selected version(s) will now be incompatible — so you catch version mismatches before they cause an in-game "incompatible" error

## 🛠 Tech Stack

- Pure HTML / CSS / JavaScript — no build step, no framework
- [JSZip](https://stuk.github.io/jszip/) — reading and writing zip archives
- [FileSaver.js](https://github.com/eligrey/FileSaver.js) — triggering the download of the merged file

## 📋 Requirements

- A modern browser (Chrome, Edge, Firefox, etc.)
- An internet connection (only needed to load JSZip, FileSaver, and Google Fonts from CDN — your addon data never leaves the browser)

## ⚠️ Notes

- The merge button is enabled once at least 2 packs (BP and/or RP) are loaded
- Every conflicting file is preserved via pack-prefixed renaming — no data is ever discarded during a merge

---

Made with 🎮 for the Minecraft Bedrock community

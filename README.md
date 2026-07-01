# ⚔ MC Addon Merger

Minecraft Bedrock Edition Addon (`.mcaddon` / `.zip`) တွေကို conflict/error မဖြစ်ဘဲ တစ်ခုတည်းအဖြစ် ပေါင်းစပ်ပေးတဲ့ browser-based tool ဖြစ်ပါတယ်။ Server မလို၊ install လုပ်စရာမလို — `index.html` ဖိုင်တစ်ခုတည်းနဲ့ browser ထဲမှာပဲ တိုက်ရိုက်အလုပ်လုပ်ပါတယ်။

## ✨ Features

- **Multi-addon merge** — Behavior Pack / Resource Pack addon အများကြီးကို တစ်ချက်တည်း ပေါင်းစည်းပေးသည်
- **Smart JSON merge** — `blocks.json`, `sounds.json`, textures, animations, render_controllers, geometry (`.geo.json`) စတာတွေကို conflict မဖြစ်အောင် အလိုအလျောက် merge ပေးသည်
- **Script namespacing** — `scripts/<pack_id>/` အောက်မှာ pack တစ်ခုချင်းစီအတွက် သီးခြားခွဲထားပေးသဖြင့် script conflict လုံးဝမရှိစေပါ
- **Minecraft version selector** — `1.26.0` / `1.26.10` / `1.26.20` / `1.26.30` ထဲက လိုချင်တဲ့ version(s) ကို ရွေးချယ်နိုင်ပြီး `min_engine_version` ကို ရွေးထားသည့်အနိမ့်ဆုံး version အလိုက် အလိုအလျောက်တွက်ချက်ပေးသည်
- **Conflict-safe rename** — file အမည်တူနေရင် pack prefix ခံပြီး rename လုပ်ထားသဖြင့် ဒေတာဘာမှ ဆုံးရှုံးမှုမရှိပါ
- **Custom pack icons** — BP/RP အတွက် icon အသစ်ကို upload လုပ်နိုင်သည် (မထည့်လျှင် မူရင်း icon ကို ဆက်သုံးသည်)
- **Live progress + log** — merge လုပ်နေစဉ် progress bar နှင့် step-by-step log ကို အချိန်နှင့်တပြေးညီ ပြသသည်

## 🚀 အသုံးပြုနည်း

1. `index.html` ဖိုင်ကို browser နဲ့ဖွင့်ပါ (double-click လုပ်ရုံပါပဲ — server ဘာမှမလိုပါ)
2. **STEP 01 — LOAD ADDONS**: merge လုပ်ချင်တဲ့ `.mcaddon` / `.zip` ဖိုင်တွေကို drag & drop (သို့) click ပြီး ရွေးထည့်ပါ
3. **STEP 02 — SETTINGS**: Output addon အမည်၊ BP/RP အမည်၊ ပါဝင်စေချင်တဲ့ Minecraft version(s) ကို ရွေးပါ (pack icon အသစ်လိုချင်ရင် upload လုပ်နိုင်ပါတယ်)
4. **STEP 03 — MERGE & DOWNLOAD**: "⚗ MERGE INTO .mcaddon" ခလုတ်ကို နှိပ်ပါ — ပေါင်းစပ်ပြီးသား `.mcaddon` ဖိုင် တစ်ခုတည်း အဆင်သင့် download ဆွဲချလိမ့်မည်

## 🎮 Minecraft Version ရွေးချယ်ခြင်း

- Version chip များထဲက တစ်ခု (သို့) အများကို ရွေးနိုင်ပါတယ် — အနည်းဆုံး ၁ ခုတော့ ရှိရပါမည်
- `min_engine_version` ကို ရွေးထားသော version များထဲက **အနိမ့်ဆုံးကို** အလိုအလျောက်သတ်မှတ်ပေးသဖြင့် ရွေးထားသည့် version များအားလုံးနှင့် ကိုက်ညီစွာ အလုပ်လုပ်ပါသည်
- Merge လုပ်မည့် addon တစ်ခုခုက ရွေးထားသည့် version ထက်မြင့်သော version ကို လိုအပ်နေပါက, system ကနေ `min_engine_version` ကို အလိုအလျောက် မြှင့်ပေးပြီး ⚠️ warning ကို log box တွင် တိကျစွာ ပြသပေးပါသည် — ဒီအချက်ကြောင့် ထုတ်လုပ်ပြီးသား addon ဟာ Minecraft ထဲတွင် "incompatible" ပြပြီး error တက်တာမျိုးကို ကြိုတင်ရှောင်ရှားနိုင်ပါသည်

## 🛠 Tech Stack

- Pure HTML / CSS / JavaScript — build step မလို, framework မလို
- [JSZip](https://stuk.github.io/jszip/) — zip ဖိုင် ဖတ်ရန်/ရေးရန်
- [FileSaver.js](https://github.com/eligrey/FileSaver.js) — merge ပြီးသား ဖိုင်ကို download trigger လုပ်ရန်

## 📋 လိုအပ်ချက်များ

- Modern browser (Chrome, Edge, Firefox စသည်)
- Internet connection (CDN မှ JSZip, FileSaver, Google Fonts များ load ရန်အတွက်သာ လိုအပ်ပြီး၊ addon ဒေတာများသည် browser ထဲမှာသာ ကျန်ရှိပါသည်)

## ⚠️ မှတ်ချက်

- Merge ခလုတ်သည် BP/RP အနည်းဆုံး ၂ pack ရှိမှသာ အသုံးပြုနိုင်ပါသည်
- Conflict ဖြစ်သော file များအားလုံးကို ပျက်စီးမသွားစေရန် pack prefix ဖြင့် rename ပြီး ထိန်းသိမ်းထားပါသည် — data မည်သည့်အရာမျှ ဆုံးရှုံးသွားမည်မဟုတ်ပါ

---

Made with 🎮 for the Minecraft Bedrock community

const { Telegraf, Markup } = require('telegraf');

// သင့်ရဲ့ Bot Token ကို ဒီမှာ အစားထိုးထည့်ပါ
const BOT_TOKEN = '8269037051:AAHBE5zOBOpHYiO7YazAbE-PnEkJGaYYvr0'; 
const bot = new Telegraf(BOT_TOKEN);

// သင့်ရဲ့ Web App လင့်ခ် (တရားဝင် bot app link)
const WEB_APP_URL = 'https://t.me/addonmerger_bot/merger';

bot.start((ctx) => {
    ctx.reply(
        `⚔ *MC Addon Merger မှ ကြိုဆိုပါတယ်!* ⚔\n\n` +
        `Minecraft Addon များကို တစ်ခုတည်းဖြစ်အောင် ပေါင်းစပ်ရန် အောက်ပါ ခလုတ်ကို နှိပ်၍ Web App ကို ဖွင့်လှစ်နိုင်ပါပြီဗျာ။`,
        {
            parse_mode: 'Markdown',
            ...Markup.inlineKeyboard([
                [Markup.button.webApp('Open Merger 🚀', WEB_APP_URL)]
            ])
        }
    );
});

bot.launch().then(() => console.log('Addon Merger Bot Is Running...'));

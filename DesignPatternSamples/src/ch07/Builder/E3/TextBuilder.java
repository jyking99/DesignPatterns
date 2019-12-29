package ch07.Builder.E3;

public class TextBuilder implements Builder {
    private StringBuffer buffer = new StringBuffer();           // このフィールドに文書を構築していく
    private boolean madeTitle = false;
    
    public void makeTitle(String title) {                       // プレーンテキストでのタイトル
        buffer.append("==============================\n");          // 飾り線
        buffer.append("『" + title + "』\n");                       // 『』つきのタイトル
        buffer.append("\n");                                        // 空行
        
        madeTitle = true;
    }
    public void makeString(String str) {                        // プレーンテキストでの文字列
    	if (!madeTitle) {
    		throw new RuntimeException("makeTitleが呼ばれていません。");
    	}
    	
    	buffer.append('■' + str + "\n");                           // ■つきの文字列
        buffer.append("\n");                                        // 空行
    }
    public void makeItems(String[] items) {                     // プレーンテキストでの箇条書き
    	if (!madeTitle) {
    		throw new RuntimeException("makeTitleが呼ばれていません。");
    	}
    	
        for (int i = 0; i < items.length; i++) {
            buffer.append("　・" + items[i] + "\n");                // ・つきの項目
        }
        buffer.append("\n");                                        // 空行
    }
    public void close() {                                       // 文書の完成
    	if (!madeTitle) {
    		throw new RuntimeException("makeTitleが呼ばれていません。");
    	}
    	
        buffer.append("==============================\n");          // 飾り線
    }
    public String getResult() {                                 // 完成した文書
        return buffer.toString();                                   // StringBufferをStringに変換
    }
}

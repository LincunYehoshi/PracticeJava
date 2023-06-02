class Cafe{
	public static void main (String[] args){
		
		
		final String productName1 = "コーヒー";
		final int productPrice1 = 250;
		final String productName2 = "ケーキ";
		final int productPrice2 = 320;
		final String productName3 = "モンブラン";
		final int productPrice3 = 350;
		final String productName4 = "タルト";
		final int productPrice4 = 400;
		final String productName5 = "フラペチーノ";
		final int productPrice5 = 600;
		
		final int discountPrice = 1000;
		final double discountRate = 0.8;
		final double tax = 1.08;
		
		
		String checkProductsName = "";
		int checkProductsCount = 0 ;
		int totalPrice = 0 ;
		int payment = 0 ;
		
		for (int i = 0; i < args.length ; i += 2){
			
			checkProductsName = args[i];
			//商品名の次の配列である金額を数値に変換し変数に代入。
			checkProductsCount = Integer.parseInt( args[i+1] );
			
			//switch文で商品ごとに小計を算出する
			switch( checkProductsName){
				
				case productName1 :
					totalPrice += productPrice1 * checkProductsCount ;
					break;
				
				case productName2 :
					totalPrice += productPrice2 * checkProductsCount ;
					break;
				
				case productName3 :
					totalPrice += productPrice3 * checkProductsCount ;
					break;
				
				case productName4 :
					totalPrice += productPrice4 * checkProductsCount ;
					break;
				
				case productName5 :
					totalPrice += productPrice5 * checkProductsCount ;
					break;
				
			}
		}
		
		if(totalPrice > discountPrice){
			payment = (int)(totalPrice * discountRate * tax);
		}else{
			payment = (int)(totalPrice * tax);
		}
		
		
		System.out.println("合計金額は" + payment + "円です。");
		
		
		
	}
		
}
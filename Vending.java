class Vending{
	public static void main (String[] args){
	
		int coinNum = args.length ;
		int coinCheck = 0 ;
		int coinSum = 0 ;
		
		for(int i = 0 ; i < coinNum ; i++){
			
			coinCheck = Integer.parseInt(args[i]);
			
			if(coinCheck == 10 || coinCheck == 50 || coinCheck == 100 || coinCheck == 500 ){
				
				coinSum = coinSum + coinCheck;
			
			}else if(coinCheck == 1 || coinCheck == 5){
				System.out.println(coinCheck + "円玉は使うことが出来ません。");
				
			}else{
				System.out.println(coinCheck + "円硬貨は存在しません。");
			}
			
		}
		
		System.out.println("投入された硬貨の合計金額は" + coinSum + "円です。");
	}

}
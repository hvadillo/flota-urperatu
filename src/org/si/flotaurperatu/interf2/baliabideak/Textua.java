package org.si.flotaurperatu.interf2.baliabideak;

public class Textua {
	
	public static String itxiText, itxiTextIzenburu;
	public static String izenaSartu;
	public static String galdu, irabazi, amaitu, argibidea;
	
	public static void kargatu(){
		izenaSartu = "Izena sartu: ";
		
		itxiText = "Ziur zaude FLOTAURPERATUtik irten nahi duzula?";
		itxiTextIzenburu = "FLOTA URPERATU ITXI";
		
		galdu="Galdu egin duzu";
		irabazi="Irabazi egin duzu";
		amaitu="Amaiera";
		
		argibidea = "<html><center><b><font size = +1>FLOTA URPERATU argibidea</font></b></center>"
		+"<br><font size = 4>"
		+"<ul>"
		+"Egin behar dugun lehenengo gauza, joko fisikoan bezala,ontziak kokatzea da. Horretarako, ontzi bakoitzeko posizioa eta ontzi mota aukeratu behar dugu."
		+" Bertikal aukeratzen badugu, ontzia goitik beherantz kokatuko da eta Horizontal aukeratzen badugu, aldiz, ezkerretik eskumarantz kokatuko da, kontuan izan behar dugu hau , bestela ez da ontzirik kokatuko."
		+" Fragatekin ez dugu arazorik izango bere luzeera kasila batekoa delako, baina beste ontziekin arazoa izango dugu kokatzeko. Adibidez, Itsaspeko bat hiru kasila dituenez eta horizontalean eta, bederatzi zutabean eta bat errekadan klik egiten badugu ez da kokatuko."
		+"</ul>"
		
		+"<br><font size = 4>"
		+"<ul>"
		+"Ontziak kokatzerako orduan kontuan izan behar dugu 10 ontziz osatuako flota daukagula: hegazkin-ontzi 1 (luzera 4), 2 itsaspeko (luzera 3), 3 suntsitzaile (luzera 2) eta 4 fragata (luzera 1)."
		+"</ul>"
		+"</font>"
		
		+"<br><font size = 4>"
		+"<ul>"
		+"Behin ontziak kokaturik daudela, gure txanda izango da, non hainbat aukera ditugu burutu ahal izateko."
		+" Alde batetik denda daukagu botoiez osatuta dagoena, eta dendako botoi bakoitza gure armamentua betetzeko edo zauritutako ontzi bat sendatzeko balio du."
		+"</ul>"
		+"</font>"
		
		+"<br><font size = 4>"
		+"<ul>"
		+"Edozein arma edo konponketa erosi ahal izateko soilik botoian klik eginez, gure dirutik arma edo konponketak balio dutena kenduko zaigu eta armen biltegian misilEM bat gehituko zaigu."
		+" Adibidez, misilEM bat erosten badugu 1000€ izanda, 850€-ekin eta 2 misilEM izanda 3 misilEM-ekin geratuko gara."
		+"</ul>"
		+"</font>"
		
		+"<br><font size = 4>"
		+"<ul>"
		+"Kontuan izan behar dugu denda bakarra dela eta ordenagailuak ere armak eta konponketak erosi ahal dituela, beraz egon adi dendako botoien armamentuaren kopuruari. Ez utzi ordenagailuak dena eros dezala."
		+"</ul>"
		+"</font>"
		
		+"<br><font size = 4>"
		+"<ul>"
		+"Bestalde, gure esku dagoen armamentua daukagu, arma mota desberdinez osaturik."
		+" Leihoaren atal honetan, dendan bezala arma mota bakoitzeko kopurua ere ikusgarri izango dugu, eta zerbait erabili eta gero kantitatea eguneratuko da."
		+" Bonba bat erabiltzen denenan, goiko tableroan aukeratzen dugun posizioa erasoko da."
		+"Misil bat erabilita, bonban bezala posizio bakar bat erastotuko da, baina misila indartzuagoa da, eta ontzi bat aurkitzen badu, ontzi osoa urperatuko da, eta ontziak ezkutua baldin badu, nahiz eta ezkutua osorik egon, ezkutua kenduko zaio. "
		+"MisilIH erabiltzean aukeratzen dugun posizioko zutabe osoa erasotuko da. "
		+"MisilEM erabiltzean aukeratzen dugun posizioko errenkada osoa erasotuko da. "
		+"MisilGurutze erabiltzean MisilIH eta MisilEM -ren efektua izango du. "
		+"Radarra erabilita, informazioa pantailan, idatziz agertuko da ontzi bat aurkitzen duen posizioan, kontuan izan bahar da radarraren erabilpen tartea, gerta daiteke bota dugun lekuan ontzirik ez aurkitzea. "
		+"Ezkutua erbiltzean, gure flotako ontzi bat babestu ahal izango dugu. "
		+"</ul>"
		+"</font>"
		
		+"<br><font size = 4>"
		+ "<ul>"
		+"Tableroan kolore desberdineko kasilak ikusiko ditugu, kolore bakoitzak esanahi bat dauka: "
		+"urdin argia --> eraso gabeko posizioa, "
		+"urdin iluna (miss) --> ura aurkitu da erasotzean, "
		+"gorria --> zauritutako posizioa, laranja --> zauritutako posizioa, eskuturik gabe geratu dena, horia  --> zauritutako posizioa, eskutua oraindik kolpe bat jaso ahal duena, berdea --> ezkuatua daukan posizioa eta grisa --> gure flotako ontzi bateko zauritu gabe dagoen posizioa."
		+"</ul>"
		+"</font>"
		
		+"<br><font size = 4>"
		+ "<ul>"
		+"Txandak pasa ahala, jokoa amaitu egingo da. Irabazi edo galtzen badugu, leiho txiki bat irekiko da."
		+"</ul>"
		+"</font>"
		;
	}

}

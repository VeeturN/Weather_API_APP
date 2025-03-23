import java.util.HashMap;
import java.util.Map;

public class Country {
    String c="AED\tUAE Dirham\tUnited Arab Emirates\n" +
            "AFN\tAfghan Afghani\tAfghanistan\n" +
            "ALL\tAlbanian Lek\tAlbania\n" +
            "AMD\tArmenian Dram\tArmenia\n" +
            "ANG\tNetherlands Antillian Guilder\tNetherlands Antilles\n" +
            "AOA\tAngolan Kwanza\tAngola\n" +
            "ARS\tArgentine Peso\tArgentina\n" +
            "AUD\tAustralian Dollar\tAustralia\n" +
            "AWG\tAruban Florin\tAruba\n" +
            "AZN\tAzerbaijani Manat\tAzerbaijan\n" +
            "BAM\tBosnia and Herzegovina Mark\tBosnia and Herzegovina\n" +
            "BBD\tBarbados Dollar\tBarbados\n" +
            "BDT\tBangladeshi Taka\tBangladesh\n" +
            "BGN\tBulgarian Lev\tBulgaria\n" +
            "BHD\tBahraini Dinar\tBahrain\n" +
            "BIF\tBurundian Franc\tBurundi\n" +
            "BMD\tBermudian Dollar\tBermuda\n" +
            "BND\tBrunei Dollar\tBrunei\n" +
            "BOB\tBolivian Boliviano\tBolivia\n" +
            "BRL\tBrazilian Real\tBrazil\n" +
            "BSD\tBahamian Dollar\tBahamas\n" +
            "BTN\tBhutanese Ngultrum\tBhutan\n" +
            "BWP\tBotswana Pula\tBotswana\n" +
            "BYN\tBelarusian Ruble\tBelarus\n" +
            "BZD\tBelize Dollar\tBelize\n" +
            "CAD\tCanadian Dollar\tCanada\n" +
            "CDF\tCongolese Franc\tDemocratic Republic of the Congo\n" +
            "CHF\tSwiss Franc\tSwitzerland\n" +
            "CLP\tChilean Peso\tChile\n" +
            "CNY\tChinese Renminbi\tChina\n" +
            "COP\tColombian Peso\tColombia\n" +
            "CRC\tCosta Rican Colon\tCosta Rica\n" +
            "CUP\tCuban Peso\tCuba\n" +
            "CVE\tCape Verdean Escudo\tCape Verde\n" +
            "CZK\tCzech Koruna\tCzech Republic\n" +
            "DJF\tDjiboutian Franc\tDjibouti\n" +
            "DKK\tDanish Krone\tDenmark\n" +
            "DOP\tDominican Peso\tDominican Republic\n" +
            "DZD\tAlgerian Dinar\tAlgeria\n" +
            "EGP\tEgyptian Pound\tEgypt\n" +
            "ERN\tEritrean Nakfa\tEritrea\n" +
            "ETB\tEthiopian Birr\tEthiopia\n" +
            "EUR\tEuro\tEuropean Union\n" +
            "FJD\tFiji Dollar\tFiji\n" +
            "FKP\tFalkland Islands Pound\tFalkland Islands\n" +
            "FOK\tFaroese Króna\tFaroe Islands\n" +
            "GBP\tPound Sterling\tUnited Kingdom\n" +
            "GEL\tGeorgian Lari\tGeorgia\n" +
            "GGP\tGuernsey Pound\tGuernsey\n" +
            "GHS\tGhanaian Cedi\tGhana\n" +
            "GIP\tGibraltar Pound\tGibraltar\n" +
            "GMD\tGambian Dalasi\tThe Gambia\n" +
            "GNF\tGuinean Franc\tGuinea\n" +
            "GTQ\tGuatemalan Quetzal\tGuatemala\n" +
            "GYD\tGuyanese Dollar\tGuyana\n" +
            "HKD\tHong Kong Dollar\tHong Kong\n" +
            "HNL\tHonduran Lempira\tHonduras\n" +
            "HRK\tCroatian Kuna\tCroatia\n" +
            "HTG\tHaitian Gourde\tHaiti\n" +
            "HUF\tHungarian Forint\tHungary\n" +
            "IDR\tIndonesian Rupiah\tIndonesia\n" +
            "ILS\tIsraeli New Shekel\tIsrael\n" +
            "IMP\tManx Pound\tIsle of Man\n" +
            "INR\tIndian Rupee\tIndia\n" +
            "IQD\tIraqi Dinar\tIraq\n" +
            "IRR\tIranian Rial\tIran\n" +
            "ISK\tIcelandic Króna\tIceland\n" +
            "JEP\tJersey Pound\tJersey\n" +
            "JMD\tJamaican Dollar\tJamaica\n" +
            "JOD\tJordanian Dinar\tJordan\n" +
            "JPY\tJapanese Yen\tJapan\n" +
            "KES\tKenyan Shilling\tKenya\n" +
            "KGS\tKyrgyzstani Som\tKyrgyzstan\n" +
            "KHR\tCambodian Riel\tCambodia\n" +
            "KID\tKiribati Dollar\tKiribati\n" +
            "KMF\tComorian Franc\tComoros\n" +
            "KRW\tSouth Korean Won\tSouth Korea\n" +
            "KWD\tKuwaiti Dinar\tKuwait\n" +
            "KYD\tCayman Islands Dollar\tCayman Islands\n" +
            "KZT\tKazakhstani Tenge\tKazakhstan\n" +
            "LAK\tLao Kip\tLaos\n" +
            "LBP\tLebanese Pound\tLebanon\n" +
            "LKR\tSri Lanka Rupee\tSri Lanka\n" +
            "LRD\tLiberian Dollar\tLiberia\n" +
            "LSL\tLesotho Loti\tLesotho\n" +
            "LYD\tLibyan Dinar\tLibya\n" +
            "MAD\tMoroccan Dirham\tMorocco\n" +
            "MDL\tMoldovan Leu\tMoldova\n" +
            "MGA\tMalagasy Ariary\tMadagascar\n" +
            "MKD\tMacedonian Denar\tNorth Macedonia\n" +
            "MMK\tBurmese Kyat\tMyanmar\n" +
            "MNT\tMongolian Tögrög\tMongolia\n" +
            "MOP\tMacanese Pataca\tMacau\n" +
            "MRU\tMauritanian Ouguiya\tMauritania\n" +
            "MUR\tMauritian Rupee\tMauritius\n" +
            "MVR\tMaldivian Rufiyaa\tMaldives\n" +
            "MWK\tMalawian Kwacha\tMalawi\n" +
            "MXN\tMexican Peso\tMexico\n" +
            "MYR\tMalaysian Ringgit\tMalaysia\n" +
            "MZN\tMozambican Metical\tMozambique\n" +
            "NAD\tNamibian Dollar\tNamibia\n" +
            "NGN\tNigerian Naira\tNigeria\n" +
            "NIO\tNicaraguan Córdoba\tNicaragua\n" +
            "NOK\tNorwegian Krone\tNorway\n" +
            "NPR\tNepalese Rupee\tNepal\n" +
            "NZD\tNew Zealand Dollar\tNew Zealand\n" +
            "OMR\tOmani Rial\tOman\n" +
            "PAB\tPanamanian Balboa\tPanama\n" +
            "PEN\tPeruvian Sol\tPeru\n" +
            "PGK\tPapua New Guinean Kina\tPapua New Guinea\n" +
            "PHP\tPhilippine Peso\tPhilippines\n" +
            "PKR\tPakistani Rupee\tPakistan\n" +
            "PLN\tPolish Złoty\tPoland\n" +
            "PYG\tParaguayan Guaraní\tParaguay\n" +
            "QAR\tQatari Riyal\tQatar\n" +
            "RON\tRomanian Leu\tRomania\n" +
            "RSD\tSerbian Dinar\tSerbia\n" +
            "RUB\tRussian Ruble\tRussia\n" +
            "RWF\tRwandan Franc\tRwanda\n" +
            "SAR\tSaudi Riyal\tSaudi Arabia\n" +
            "SBD\tSolomon Islands Dollar\tSolomon Islands\n" +
            "SCR\tSeychellois Rupee\tSeychelles\n" +
            "SDG\tSudanese Pound\tSudan\n" +
            "SEK\tSwedish Krona\tSweden\n" +
            "SGD\tSingapore Dollar\tSingapore\n" +
            "SHP\tSaint Helena Pound\tSaint Helena\n" +
            "SLE\tSierra Leonean Leone\tSierra Leone\n" +
            "SOS\tSomali Shilling\tSomalia\n" +
            "SRD\tSurinamese Dollar\tSuriname\n" +
            "SSP\tSouth Sudanese Pound\tSouth Sudan\n" +
            "STN\tSão Tomé and Príncipe Dobra\tSão Tomé and Príncipe\n" +
            "SYP\tSyrian Pound\tSyria\n" +
            "SZL\tEswatini Lilangeni\tEswatini\n" +
            "THB\tThai Baht\tThailand\n" +
            "TJS\tTajikistani Somoni\tTajikistan\n" +
            "TMT\tTurkmenistan Manat\tTurkmenistan\n" +
            "TND\tTunisian Dinar\tTunisia\n" +
            "TOP\tTongan Paʻanga\tTonga\n" +
            "TRY\tTurkish Lira\tTurkey\n" +
            "TTD\tTrinidad and Tobago Dollar\tTrinidad and Tobago\n" +
            "TVD\tTuvaluan Dollar\tTuvalu\n" +
            "TWD\tNew Taiwan Dollar\tTaiwan\n" +
            "TZS\tTanzanian Shilling\tTanzania\n" +
            "UAH\tUkrainian Hryvnia\tUkraine\n" +
            "UGX\tUgandan Shilling\tUganda\n" +
            "USD\tUnited States Dollar\tUnited States\n" +
            "UYU\tUruguayan Peso\tUruguay\n" +
            "UZS\tUzbekistani So'm\tUzbekistan\n" +
            "VES\tVenezuelan Bolívar Soberano\tVenezuela\n" +
            "VND\tVietnamese Đồng\tVietnam\n" +
            "VUV\tVanuatu Vatu\tVanuatu\n" +
            "WST\tSamoan Tālā\tSamoa\n" +
            "XAF\tCentral African CFA Franc\tCEMAC\n" +
            "XCD\tEast Caribbean Dollar\tOrganisation of Eastern Caribbean States\n" +
            "XDR\tSpecial Drawing Rights\tInternational Monetary Fund\n" +
            "XOF\tWest African CFA franc\tCFA\n" +
            "XPF\tCFP Franc\tCollectivités d'Outre-Mer\n" +
            "YER\tYemeni Rial\tYemen\n" +
            "ZAR\tSouth African Rand\tSouth Africa\n" +
            "ZMW\tZambian Kwacha\tZambia\n" +
            "ZWL\tZimbabwean Dollar\tZimbabwe";
    public Map<String, String> countries = new HashMap<>();
    public Map<String, String> countriesReverse = new HashMap<>();

    public Country() {
        String[] lines = c.split("\n");
        for (String line : lines) {
            String[] parts = line.split("\t");
            countries.put(parts[2], parts[0]);
        }

        String[] lines2 = c.split("\n");
        for (String line : lines2) {
            String[] parts = line.split("\t");
            countriesReverse.put(parts[0], parts[2]);
        }
    }
}

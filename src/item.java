import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class item {
	public static String[] itemList; 
	public static itemSpace[] itemBox = new itemSpace[2300];
	public static int emptySpaceInItemBox;
	public static String inputString = "調合書①入門編\n調合書②初級編\n調合書③中級編\n調合書④上級編\n調合書⑤達人編\n収納上手・技の書\n収納上手・力の書\n双眼鏡\n回復薬\n回復薬グレート\n栄養剤\n栄養剤グレート\n解毒薬\n活力剤\n強走薬\n強走薬グレート\n鬼人薬\n鬼人薬グレート\n怪力の丸薬\n硬化薬\n硬化薬グレート\n忍耐の丸薬\nクーラードリンク\nホットドリンク\n消散剤\n千里眼の薬\n漢方薬\n秘薬\nいにしえの秘薬\n元気ドリンコ\n生命の粉塵\n生命の大粉塵\n狩技ドリンク\n増強剤\n爆薬\n生命の粉\n捕獲用麻酔薬\nユクモ温泉たまご\nタンジアチップス\n力の護符\n力の爪\n守りの護符\n守りの爪\n肉焼きセット\n生肉\n毒生肉\nシビレ生肉\n眠り生肉\n生焼け肉\nこんがり肉\nコゲ肉\nクーラーミート\nホットミート\nモスジャーキー\nキングミート\n砥石\nボロピッケル\nピッケル\nピッケルグレート\nボロ虫あみ\n虫あみ\n虫あみグレート\nブーメラン\n投げナイフ\n毒投げナイフ\n眠り投げナイフ\n麻痺投げナイフ\n捕獲用麻酔ナイフ\n素材玉\nペイントボール\n閃光玉\n音爆弾\n捕獲用麻酔玉\n消臭玉\nけむり玉\n毒けむり玉\nモドリ玉\nこやし玉\nモンスターのフン\nトラップツール\nクモの巣\nネット\n落とし穴\nシビレ罠\nタルの蓋\n小タル\n大タル\n小タル爆弾\n大タル爆弾\n大タル爆弾Ｇ\n打上げタル爆弾\n打上げタル爆弾Ｇ\nアイテム非選択\n会心の刃薬\n重撃の刃薬\n減気の刃薬\n心眼の刃薬\nカラの実\nカラ骨\nLV1 通常弾\nLV2 通常弾\nLV3 通常弾\nLV1 貫通弾\nLV2 貫通弾\nLV3 貫通弾\nLV1 散弾\nLV2 散弾\nLV3 散弾\nLV1 徹甲榴弾\nLV2 徹甲榴弾\nLV3 徹甲榴弾\nLV1 拡散弾\nLV2 拡散弾\nLV3 拡散弾\nLV1 火炎弾\nLV1 水冷弾\nLV1 電撃弾\nLV1 氷結弾\nLV1 滅龍弾\nLV1 毒弾\nLV2 毒弾\nLV1 麻痺弾\nLV2 麻痺弾\nLV1 睡眠弾\nLV2 睡眠弾\nLV1 減気弾\nLV2 減気弾\nLV1 回復弾\nLV2 回復弾\nペイント弾\n捕獲用麻酔弾\nLV1 通常弾\nLV2 通常弾\nLV3 通常弾\nLV1 貫通弾\nLV2 貫通弾\nLV3 貫通弾\nLV1 散弾\nLV2 散弾\nLV3 散弾\nLV1 徹甲榴弾\nLV2 徹甲榴弾\nLV3 徹甲榴弾\nLV1 拡散弾\nLV2 拡散弾\nLV3 拡散弾\nLV1 火炎弾\nLV1 水冷弾\nLV1 電撃弾\nLV1 氷結弾\nLV1 滅龍弾\nLV1 毒弾\nLV2 毒弾\nLV1 麻痺弾\nLV2 麻痺弾\nLV1 睡眠弾\nLV2 睡眠弾\nLV1 減気弾\nLV2 減気弾\nLV1 回復弾\nLV2 回復弾\nペイント弾\n捕獲用麻酔弾\nツブテ弾\n竜撃弾\nLV1 斬裂弾\nLV2 斬裂弾\nLV1 爆破弾\nLV2 爆破弾\n鬼人弾\n鬼人会心弾\n硬化弾\n硬化強靭弾\nLV1 強装弾\nLV2 強装弾\nLV1 重撃弾\nLV2 重撃弾\n痛撃弾\nLV2 火炎弾\nLV2 水冷弾\nLV2 電撃弾\nLV2 氷結弾\nLV2 滅龍弾\nLV1 貫通火炎弾\nLV2 貫通火炎弾\nLV1 貫通水冷弾\nLV2 貫通水冷弾\nLV1 貫通電撃弾\nLV2 貫通電撃弾\nLV1 貫通氷結弾\nLV2 貫通氷結弾\nLV1 大砲弾\nLV2 大砲弾\nLV1 遠撃弾\nLV2 遠撃弾\n連爆榴弾\n榴散弾\n烈光弾\n毒煙弾\n閃光弾\nこやし弾\n治癒活力弾\n広域回復弾\n鬼人硬化弾\nRAPID\nビン無し\n空きビン\nLV1 強撃ビン\nLV2 強撃ビン\nLV1 属性強化ビン\nLV2 属性強化ビン\n接撃ビン\n毒ビン\n麻痺ビン\n睡眠ビン\n減気ビン\n爆破ビン\nペイントビン\n養虫エキス\n超養虫エキス\n力の成長餌\n重の成長餌\n速の成長餌\n火の蜜餌\n水の蜜餌\n雷の蜜餌\n氷の蜜餌\n龍の蜜餌\n力の上成長餌\n重の上成長餌\n速の上成長餌\n力の特上成長餌\n重の特上成長餌\n速の特上成長餌\n火炎の蜜餌\n流水の蜜餌\n雷光の蜜餌\n氷結の蜜餌\n破龍の蜜餌\n鎮火の蜜餌\n断水の蜜餌\n絶雷の蜜餌\n砕氷の蜜餌\n滅龍の蜜餌\nマキモドシの蜜餌\nマカ錬金タル\nレンキンフード\nレンキン活力剤\nレンキン耳栓\nレンキンフエール\nレンキン気合玉\nレンキン狩技砥石\nレンキン狩技弾\nレンキン狩技ビン\nレンキン音波爆弾\nレンキン速振薬\nレンキンバズーカ\nレンキン癒しタル\n釣りミミズ\n釣りフィーバエ\n釣りカエル\nサシミダンゴ\nバクダンゴ\n黄金ダンゴ\n角笛\n回復笛\n解毒笛\n鬼人笛\n硬化笛\nもえないゴミ\nハチミツ\n薬草\nげどく草\n火薬草\nツタの葉\nネムリ草\nネンチャク草\nマタタビ\n落陽草の根\nトウガラシ\n霜ふり草\n特産キノコキムチ\n氷結晶イチゴ\nキングサボテン\nドスビスカス\nオオモロコシ\n星見の花\n七色たんぽぽ\nちいさな研精石\n龍神カズラ\n大龍神カズラ\nアオキノコ\nニトロダケ\nマヒダケ\n毒テングダケ\nクタビレタケ\nドキドキノコ\nマンドラゴラ\n混沌茸\nオオマヒシメジ\nコシカケダケ\nペイントの実\n怪力の種\n忍耐の種\nウチケシの実\n龍殺しの実\nはじけクルミ\nハリの実\nツラヌキの実\nカクサンの実\nペピポパンプキン\nオオ筒ドングリ\nトンガリドングリ\nユクモの木\nユクモの堅木\nユクモの重木\n石ころ\n鉄鉱石\n大地の結晶\nマカライト鉱石\n円盤石\n氷結晶\nベアライト石\nライトクリスタル\nドラグライト鉱石\n紅蓮石\n真紅蓮石\n溶岩塊\nカブレライト鉱石\nエルトライト鉱石\nメランジェ鉱石\nノヴァクリスタル\nピュアクリスタル\nユニオン鉱石\n獄炎石\n虹色鉱石\n高密度の研精石\nアルティマ結晶\n水光原珠\n陽翔原珠\n修羅原珠\n瑠璃原珠\n金剛原珠\n明王原珠\n鎧石\n鎧玉\n上鎧玉\n尖鎧玉\n堅鎧玉\n重鎧玉\n王鎧玉\n真鎧玉\nなぞのお守り\n光るお守り\n古びたお守り\n風化したお守り\nさびた塊\n太古の塊\n生焼け魚\nコゲ魚\nこんがり魚\nキレアジ\nサシミウオ\n眠魚\nハリマグロ\nカジキマグロ\nはじけイワシ\nカクサンデメキン\nハレツアロワナ\nバクレツアロワナ\n大食いマグロ\nドス大食いマグロ\n古代魚\n小金魚\nシンドイワシ\nイチノタチウオ\nうなりうねり貝\nヨロイシダイ\n古代鮫の皮\n春夜鯉\nオオシッポガエル\n金剛魚\n虫の死骸\n不死虫\nにが虫\n光蟲\n雷光虫\nボンバッタ\nツチハチノコ\n冥カイコ\nセッチャクロアリ\nキラビートル\nドスヘラクレス\n超電雷光虫\n王族カナブン\nマレコガネ\nハナスズムシ\nオオツノアゲハ\nオオクワアゲハ\nオオナナホシ\n皇帝バッタ\nマボロシチョウ\n毒クモリ\nオオ毒クモリ\nオオゲキ毒クモリ\n蝕龍蟲\n竜骨【小】\n竜骨【中】\n竜骨【大】\nなぞの骨\nなぞの頭骨\nなぞの巨骨\n上竜骨\n尖竜骨\n堅竜骨\n強竜骨\n重竜骨\n古龍骨\n太古竜骨\n上質な鳥竜骨\n堅牢な鳥竜骨\n草食種の大重骨\n獣骨\n大きな骨\n堅牢な骨\n重厚な骨\nいにしえの龍骨\nいにしえの巨龍骨\n異形の骨\n異形の堅骨\n異形の重骨\n竜の牙\n竜の爪\nとがった爪\n鋭利な爪\nとがった牙\n重厚な牙\n鳥竜玉\n幻鳥竜玉\n竜玉\n大竜玉\n古龍の血\n古龍の浄血\n古龍の浄濃血\n鋼のたまご\n銀のたまご\n金のたまご\nプラチナのたまご\nフエールピッケル\n鳴き袋\n毒袋\n猛毒袋\n劇烈毒袋\n麻痺袋\n強力麻痺袋\n濃縮麻痺袋\n睡眠袋\n昏睡袋\n卒倒昏睡袋\n火炎袋\n爆炎袋\n業炎袋\n電気袋\n電撃袋\n雷電袋\n凍結袋\n瞬間凍結袋\n水袋\n大水袋\n特大水袋\n狂走エキス\nアルビノエキス\n獰猛化エキス\n獰猛化濃縮エキス\n獰猛な牙\n獰猛な鋭牙\n獰猛な重牙\n獰猛な重鋭牙\n獰猛な重剛牙\n獰猛な爪\n獰猛な尖爪\n獰猛な重爪\n獰猛な重尖爪\n獰猛な重剛爪\n獰猛な竜骨\n獰猛な強竜骨\n獰猛な重竜骨\n獰猛な尖角\n獰猛な剛角\n獰猛な火炎袋\n獰猛な業炎袋\n獰猛な炎鱗\n獰猛な獄炎鱗\n獰猛な水袋\n獰猛な特大水袋\n獰猛な体液\n獰猛な濃体液\n獰猛な電気袋\n獰猛な雷電袋\n獰猛な帯電殻\n獰猛な帯電重殻\n獰猛な帯電毛\n獰猛な雷電毛\n獰猛な氷塊\n獰猛な大氷塊\n獰猛な蝕龍鱗\n獰猛な蝕龍厚鱗\n獰猛な毒液\n獰猛な強毒液\n獰猛な麻痺毒液\n獰猛な強麻痺毒液\n獰猛な睡眠袋\n獰猛な昏睡袋\n獰猛な睡眠毒液\n獰猛な強睡眠毒液\n獰猛な爆液\n獰猛な爆縮液\nネコ毛の紅玉\n首鳴竜の皮\n首鳴竜の特上皮\n丸鳥の羽\n丸鳥の特上羽\n雲羊鹿の角\n雲羊鹿の毛玉\n雲羊鹿の重角\nケルビの角\n暖かい毛皮\n上質な毛皮\n極上の毛皮\nガウシカの角\nガウシカの重角\n草食竜の甲殻\n草食竜の堅殻\n草食竜の頭殻\n垂皮竜の上皮\n柔軟な厚皮\nモンスターの体液\nモンスターの濃汁\nモンスターの特濃\n飛甲虫の甲殻\n飛甲虫の堅殻\n飛甲虫の羽\n飛甲虫の斬羽\n甲虫の大顎\n甲虫の腹袋\n上質な腹袋\n特上な腹袋\nランゴスタの甲殻\nランゴスタの堅殻\nランゴスタの羽\nランゴスタの薄羽\nランゴスタの斬羽\nカンタロスの甲殻\nカンタロスの堅殻\nカンタロスの羽\nカンタロスの薄羽\nカンタロスの斬羽\nカンタロスの頭\n盾虫の甲殻\n盾虫の堅殻\n盾虫の重殻\n雷光エキス\n雷光ゼリー\n翼蛇竜の皮\n翼蛇竜の上皮\n翼蛇竜の特上皮\n縞模様の皮\n縞模様の特上皮\n翼蛇竜の頭\n翼蛇竜の特上頭\n鳥竜種の牙\nマッカォの鱗\nマッカォの上鱗\nマッカォの厚鱗\nマッカォの皮\n跳狗竜の鱗\n跳狗竜の上鱗\n跳狗竜の厚鱗\n跳狗竜の赤皮\n跳狗竜の上赤皮\n跳狗竜の大赤皮\n王者の冠羽\n偉大な冠羽\n跳狗竜の尾棘\n跳狗竜の重尾棘\nジャギィの鱗\nジャギィの上鱗\nジャギィの厚鱗\nジャギィの皮\nジャギィの厚皮\nランポスの鱗\nランポスの上鱗\nランポスの厚鱗\nランポスの皮\nランポスの上皮\nランポスの大皮\nランポスの大上皮\nランポスの大厚皮\nランポスの大爪\nランポスの大尖爪\nランポスの大剛爪\nドスランポスの頭\nゲネポスの麻痺牙\nゲネポスの鱗\nゲネポスの上鱗\nゲネポスの厚鱗\nゲネポスの皮\nゲネポスの上皮\nゲネポスの大皮\nゲネポスの大上皮\nゲネポスの大厚皮\nゲネポスの大牙\nゲネポスの大尖牙\nゲネポスの大剛牙\nドスゲネポスの頭\nイーオスの毒牙\nイーオスの鱗\nイーオスの上鱗\nイーオスの厚鱗\nイーオスの皮\nイーオスの上皮\nイーオスの大皮\nイーオスの大上皮\nイーオスの大厚皮\nイーオスの紫鱗\nイーオスの上紫鱗\nイーオスの厚紫鱗\nドスイーオスの頭\nギアノスの鱗\nギアノスの上鱗\nギアノスの厚鱗\nギアノスの皮\nギアノスの上皮\nギアノスの大上皮\nギアノスの大厚皮\nギアノスの大尖爪\nギアノスの大剛爪\nドスギアノスの頭\n青熊獣の毛\n青熊獣の剛毛\n青熊獣の豪剛毛\n青熊獣の甲殻\n青熊獣の堅殻\n青熊獣の重殻\n青熊獣の腕甲\n青熊獣の堅腕甲\n青熊獣の重腕甲\n紅兜の毛\n紅兜の剛毛\n紅兜の豪剛毛\n紅兜の甲殻\n紅兜の堅殻\n紅兜の重殻\n紅兜の怒髪\n紅兜の激怒髪\n紅兜の天頂怒髪\n白兎獣の毛\n白兎獣の剛毛\n白兎獣の豪剛毛\n白兎獣の耳\n白兎獣の大耳\n白兎獣の腹甲\n白兎獣の堅腹甲\n白兎獣の重腹甲\n白兎獣の氷爪\n白兎獣の凍爪\n白兎獣の剛凍爪\n大雪主の毛\n大雪主の剛毛\n大雪主の豪剛毛\n大雪主の腹甲\n大雪主の堅腹甲\n大雪主の重腹甲\n赤甲獣の甲殻\n赤甲獣の堅殻\n赤甲獣の重殻\n赤甲獣の爪\n赤甲獣の尖爪\n赤甲獣の剛爪\n赤甲獣の蛇腹甲\n赤甲獣の大蛇腹甲\n怪鳥の鱗\n怪鳥の上鱗\n怪鳥の厚鱗\n怪鳥の甲殻\n怪鳥の堅殻\n怪鳥の重殻\n怪鳥の耳\n怪鳥の地獄耳\n怪鳥の福耳\n巨大なクチバシ\n立派なクチバシ\n怪鳥の翼膜\n怪鳥の厚翼膜\n獰猛化怪鳥鱗\n獰猛化怪鳥厚鱗\nゴム質の皮\nゴム質の上皮\nゴム質の特上皮\n毒怪鳥の翼膜\n毒怪鳥の厚翼膜\n毒怪鳥の翼\n毒怪鳥の頭\n毒怪鳥の石頭\n獰猛化毒怪鳥皮\n獰猛化毒怪鳥特皮\n夜鳥の羽鱗\n夜鳥の上羽鱗\n夜鳥の特上羽鱗\n夜鳥の翼膜\n夜鳥の翼\n夜鳥の大翼\n夜鳥の翼爪\n夜鳥の鋭翼爪\n夜鳥の剛翼爪\n夜鳥の耳\n夜鳥の福耳\n夜鳥の尾羽\n夜鳥の刃尾羽\n夜鳥の金羽\n夜鳥の黄金羽\n獰猛化夜鳥羽\n獰猛化夜鳥特上羽\n朧隠の特上羽鱗\n朧隠の大翼\n朧隠の透過鱗粉\n黒狼鳥の鱗\n黒狼鳥の上鱗\n黒狼鳥の厚鱗\n黒狼鳥の甲殻\n黒狼鳥の堅殻\n黒狼鳥の重殻\n黒狼鳥の耳\n黒狼鳥の地獄耳\n尖ったクチバシ\nイカしたクチバシ\n黒狼鳥の翼\n黒狼鳥の剛翼\n黒狼鳥の尻尾\n黒狼鳥の靭尾\n黒狼鳥のたてがみ\n黒狼鳥の銀狼毛\n獰猛化黒狼鳥鱗\n獰猛化黒狼鳥厚鱗\n隻眼の鱗\n隻眼の上鱗\n隻眼の厚鱗\n隻眼の甲殻\n隻眼の堅殻\n隻眼の重殻\nモスの苔皮\nモスの厚苔皮\nファンゴの毛皮\nファンゴの上毛皮\nファンゴの厚毛皮\nファンゴの頭\n大猪の皮\n大猪の硬い皮\n大猪の分厚い皮\n大猪の牙\n大猪の大牙\n大猪の大剛牙\nコンガの剛毛\nコンガの豪剛毛\n堅牢な牙獣牙\n桃毛獣の剛毛\n桃毛獣の豪剛毛\n桃毛獣の牙\n桃毛獣の尖牙\n極彩色の毛\n極彩色の豪剛毛\n桃毛獣の剛爪\n獰猛化桃毛獣剛毛\nブランゴの毛\nブランゴの剛毛\nブランゴの豪剛毛\n雪獅子の毛\n雪獅子の剛毛\n雪獅子の豪剛毛\n雪獅子の牙\n雪獅子の鋭牙\n雪獅子の重牙\n雪獅子の髭\n強靭な牙獣髭\n雪獅子の尻尾\n雪獅子の靭尾\n獰猛化雪獅子毛\n獰猛化雪獅子剛毛\n奇猿狐の剛毛\n奇猿狐の豪剛毛\n奇猿狐の堅長骨\n奇猿狐の重長骨\n奇猿狐の鉤爪\n奇猿狐の剛鉤爪\n奇猿狐の大耳\n奇猿狐の地獄耳\n奇猿狐の尻尾\n奇猿狐の靭尾\n獰猛化奇猿狐毛\n獰猛化奇猿狐剛毛\nエビの小殻\nエビの大殻\nエビの巨大殻\n砂竜の鱗\n砂竜の上鱗\n砂竜の厚鱗\n砂竜のヒレ\n砂竜の上ヒレ\n砂竜の特上ヒレ\n砂竜の牙\n砂竜の鋭牙\n砂竜の重牙\n水竜の上鱗\n水竜の厚鱗\n水竜の上ヒレ\n水竜の特上ヒレ\n水竜の鋭牙\n水竜の重牙\n水竜の翼膜\n水竜の剛翼膜\n水竜のお頭\n水竜の絶品お頭\n獰猛化水竜鱗\n獰猛化水竜厚鱗\n溶岩竜の上鱗\n溶岩竜の厚鱗\n溶岩竜の堅殻\n溶岩竜の重殻\n溶岩竜の鋭牙\n溶岩竜の重牙\n溶岩竜の上ヒレ\n溶岩竜の特上ヒレ\n獰猛化溶岩竜鱗\n獰猛化溶岩竜厚鱗\n水生獣の皮\n水生獣の上皮\n水生獣の厚皮\n未熟な海綿質\n海綿質の皮\n海綿質の上皮\n海綿質の厚皮\n水獣の鱗\n水獣の上鱗\n水獣の厚鱗\n水獣の爪\n水獣の鋭爪\n水獣の剛爪\n水獣のトサカ\n高級なトサカ\nイカしたトサカ\n水獣の尻尾\n水獣の靭尾\n獰猛化水獣鱗\n獰猛化水獣厚鱗\n潜口竜の甲殻\n潜口竜の堅殻\n潜口竜の重殻\n潜口竜の皮\n潜口竜の上皮\n潜口竜の厚皮\n潜口竜の爪\n潜口竜の尖爪\n潜口竜の剛爪\n潜口竜の頭殻\n潜口竜の重頭殻\n鮮やかな体液\n極彩色の体液\n光り輝く体液\n獰猛化潜口竜殻\n獰猛化潜口竜重殻\n海竜の皮\n海竜の上皮\n海竜の厚皮\n海竜の鱗\n海竜の上鱗\n海竜の厚鱗\n海竜の背電殻\n海竜の高電殻\n海竜の雷電殻\n海竜の角\n海竜の尖角\n海竜の剛角\n海竜の尻尾\n海竜の剛尾\n海竜の爪\n海竜の鋭爪\n海竜の剛爪\n海竜の逆鱗\n海竜の蒼玉\n海竜の蒼天鱗\n獰猛化海竜皮\n獰猛化海竜厚皮\n溶岩獣の鱗\n溶岩獣の上鱗\n溶岩獣の厚鱗\n炎戈竜の燃鱗\n炎戈竜の堅殻\n炎戈竜の重殻\n炎戈竜の上皮\n炎戈竜の厚皮\n炎戈竜の鋭爪\n炎戈竜の剛爪\n炎戈竜の上ヒレ\n炎戈竜の特上ヒレ\n炎戈竜の碇口\n炎戈竜の尻尾\n赤熱した堅胸殻\n赤熱した重胸殻\n獰猛化炎戈竜殻\n獰猛化炎戈竜重殻\n鬼蛙の鱗\n鬼蛙の上鱗\n鬼蛙の厚鱗\n鬼蛙の甲殻\n鬼蛙の堅殻\n鬼蛙の重殻\n鬼蛙の爪\n鬼蛙の尖爪\n鬼蛙の剛爪\n鬼蛙の大牙\n鬼蛙の巨大牙\n鬼蛙の弩級牙\n厳めしい頭骨\n強面な大頭骨\nカワズの油\nカワズの殿油\nカワズの大殿油\n獰猛化鬼蛙鱗\n獰猛化鬼蛙厚鱗\n岩穿の鱗\n岩穿の上鱗\n岩穿の厚鱗\n岩穿の甲殻\n岩穿の堅殻\n岩穿の重殻\n岩穿の巨大牙\n岩穿の極大牙\n岩穿の弩級牙\n鮫肌の鱗\n肉厚な上皮\n化け鮫の上皮\n化け鮫の厚皮\n化け鮫の上鱗\n化け鮫の厚鱗\n化け鮫の上ヒレ\n化け鮫の特上ヒレ\n化け鮫の鋸歯\n化け鮫の重鋸歯\n化け鮫の刃尾\n化け鮫の剛刃尾\n獰猛化化け鮫皮\n獰猛化化け鮫厚皮\n絞蛇竜の甲殻\n絞蛇竜の重鳴甲\n絞蛇竜の堅殻\n絞蛇竜の重殻\n絞蛇竜の皮\n絞蛇竜の上皮\n絞蛇竜の厚皮\n絞蛇竜の骨髄\n絞蛇竜の延髄\n絞蛇竜の鳴甲\n絞蛇竜の上鳴甲\n絞蛇竜の牙\n寒気立つクチバシ\n身も凍るクチバシ\n獰猛化絞蛇竜殻\n獰猛化絞蛇竜重殻\n黒真珠\n極上黒真珠\n竜頭殻\n重竜頭殻\n朽ちた真紅の角\n古びた真紅の角\n盾蟹の小殻\n盾蟹の極小殻\n盾蟹の甲殻\n盾蟹の堅殻\n盾蟹の重殻\n盾蟹の爪\n盾蟹の尖爪\n盾蟹の剛爪\n獰猛化盾蟹殻\n獰猛化盾蟹重殻\n矛砕の甲殻\n矛砕の堅殻\n矛砕の重殻\n矛砕の爪\n矛砕の尖爪\n矛砕の剛爪\n鎌蟹の小殻\n鎌蟹の甲殻\n鎌蟹の堅殻\n鎌蟹の重殻\n鎌蟹の脚\n鎌蟹の堅脚\n鎌蟹の重脚\n鎌蟹の爪\n鎌蟹の尖爪\n鎌蟹の剛爪\n獰猛化鎌蟹殻\n獰猛化鎌蟹重殻\n鎧裂の重竜頭殻\n鎧裂の重殻\n鎧裂の剛爪\n影蜘蛛の堅殻\n影蜘蛛の重殻\n影蜘蛛の堅鋏角\n影蜘蛛の重鋏角\n影蜘蛛の鋭爪\n影蜘蛛の剛爪\n影蜘蛛の上棘\n影蜘蛛の秘棘\n獰猛化影蜘蛛重殻\n徹甲虫の堅殻\n徹甲虫の重殻\n徹甲虫の薄羽\n徹甲虫の斬羽\n徹甲虫の尖角\n徹甲虫の剛角\n重甲虫の堅殻\n重甲虫の重殻\n重甲虫の堅胸殻\n重甲虫の重胸殻\n重甲虫の鋭爪\n重甲虫の剛爪\n重甲虫の大顎\n重甲虫の重顎\n重甲虫の円月尾\n重甲虫の断月尾\n重甲エキス\n特濃重甲エキス\n獰猛化重甲虫殻\n獰猛化重甲虫重殻\n土砂竜の堅殻\n土砂竜の重殻\n土砂竜の堅甲\n土砂竜の重甲\n土砂竜の鋭爪\n土砂竜の剛爪\n土砂竜の頭殻\n土砂竜の重頭殻\n土砂竜の尻尾\n土砂竜の靭尾\n肥沃なドロ\n獰猛化土砂竜重殻\n爆鎚竜の鱗\n爆鎚竜の上鱗\n爆鎚竜の厚鱗\n爆鎚竜の甲殻\n爆鎚竜の堅殻\n爆鎚竜の重殻\n爆鎚竜の顎\n爆鎚竜の重顎\n爆鎚竜の耐熱殻\n爆鎚竜の重耐熱殻\n爆鎚竜の骨髄\n爆鎚竜の紅玉\n爆鎚竜の天殻\n獰猛化爆鎚竜鱗\n獰猛化爆鎚竜厚鱗\n宝纏の鱗\n宝纏の上鱗\n宝纏の厚鱗\n宝纏の宝顎\n宝纏の財宝顎\n宝纏の秘宝顎\n宝岩塊\n宝岩巨塊\n砕竜の甲殻\n砕竜の堅殻\n砕竜の重殻\n砕竜の黒曜甲\n砕竜の堅黒曜甲\n砕竜の重黒曜甲\n砕竜の頭殻\n砕竜の尖頭殻\n砕竜の重頭殻\n砕竜の弾頭殻\nなぞの粘菌\n光る粘菌\n臨界極まる粘菌\n砕竜の拳\n砕竜の剛拳\n砕竜の剛鉄拳\n砕竜の撃減拳\n砕竜の尻尾\n砕竜の靭尾\n砕竜の骨髄\n砕竜の宝玉\n砕竜の天殻\n不滅の炉心殻\n獰猛化砕竜殻\n獰猛化砕竜重殻\n尾槌竜の堅殻\n尾槌竜の重殻\n尾槌竜の堅苔甲\n尾槌竜の重苔甲\n尾槌竜のコブ\n霜降りのコブ\n尾槌竜の堅尾甲\n尾槌竜の重尾甲\n尾槌竜の尖角\n尾槌竜の剛角\n尾槌竜の仙骨\nドボルストーン\n獰猛化尾槌竜殻\n獰猛化尾槌竜重殻\nブヨブヨした皮\n真珠色の柔皮\n真珠色の艶皮\nアルビノの中落ち\nアルビノの霜降り\n特撰アルビノ\n獰猛化白柔皮\n獰猛化白柔艶皮\n迅竜の鱗\n迅竜の上鱗\n迅竜の厚鱗\n迅竜の黒毛\n迅竜の上黒毛\n迅竜の豪黒毛\n迅竜の尻尾\n迅竜の靭尾\n迅竜の尾棘\n迅竜の重尾棘\n迅竜の刃翼\n迅竜の鋭刃翼\n迅竜の剛刃翼\n迅竜の牙\n迅竜の鋭牙\n迅竜の重牙\n迅竜の骨髄\n迅竜の延髄\n迅竜の天鱗\n獰猛化迅竜鱗\n獰猛化迅竜厚鱗\n白疾風の鱗\n白疾風の上鱗\n白疾風の厚鱗\n白疾風の黒毛\n白疾風の上黒毛\n白疾風の豪黒毛\n氷牙竜の堅殻\n氷牙竜の重殻\n氷牙竜の上毛皮\n氷牙竜の厚毛皮\n氷牙竜の鋭爪\n氷牙竜の剛爪\n琥珀色の鋭牙\n琥珀色の重牙\n氷牙竜の棘\n氷牙竜の尻尾\n氷牙竜の靭尾\n獰猛化氷牙竜厚皮\n岩竜の堅殻\n岩竜の翼\n岩竜の涙\n岩竜の重殻\n岩竜の剛翼\n岩竜の天殻\n獰猛化岩竜重殻\n鎧竜の堅殻\n鎧竜の重殻\n鎧竜の頭殻\n鎧竜の重頭殻\n鎧竜の翼\n鎧竜の剛翼\n鎧竜の延髄\n鎧竜の天殻\n獰猛化鎧竜重殻\n雌火竜の鱗\n雌火竜の上鱗\n雌火竜の厚鱗\n雌火竜の甲殻\n雌火竜の堅殻\n雌火竜の重殻\n雌火竜の翼膜\n雌火竜の厚翼膜\n雌火竜の棘\n雌火竜の上棘\n雌火竜の秘棘\n雌火竜の逆鱗\n雌火竜の紅玉\n雌火竜の天鱗\n獰猛化雌火竜鱗\n獰猛化雌火竜厚鱗\n紫毒姫の鱗\n紫毒姫の上鱗\n紫毒姫の厚鱗\n紫毒姫の甲殻\n紫毒姫の堅殻\n紫毒姫の重殻\n金火竜の上鱗\n金火竜の厚鱗\n金火竜の堅殻\n金火竜の重殻\n金火竜の上棘\n金火竜の秘棘\n獰猛化金火竜鱗\n獰猛化金火竜厚鱗\n火竜の鱗\n火竜の上鱗\n火竜の厚鱗\n火竜の甲殻\n火竜の堅殻\n火竜の重殻\n火竜の翼膜\n火竜の翼\n火竜の剛翼\n火竜の尻尾\n火竜の靭尾\n火竜の逆鱗\n火竜の紅玉\n火竜の天鱗\n獰猛化火竜鱗\n獰猛化火竜厚鱗\n黒炎王の鱗\n黒炎王の上鱗\n黒炎王の厚鱗\n黒炎王の甲殻\n黒炎王の堅殻\n黒炎王の重殻\n銀火竜の上鱗\n銀火竜の厚鱗\n銀火竜の堅殻\n銀火竜の重殻\n銀火竜の尻尾\n銀火竜の靭尾\n獰猛化銀火竜鱗\n獰猛化銀火竜厚鱗\n火竜の翼爪\n火竜の剛翼爪\n火竜の骨髄\n火竜の延髄\n火竜の煌液\n煌炎の雫\n雷狼竜の甲殻\n雷狼竜の堅殻\n雷狼竜の重殻\n雷狼竜の帯電毛\n雷狼竜の高電毛\n雷狼竜の雷電毛\n雷狼竜の角\n雷狼竜の尖角\n雷狼竜の剛角\n雷狼竜の爪\n雷狼竜の尖爪\n雷狼竜の剛爪\n雷狼竜の尻尾\n雷狼竜の靭尾\n雷狼竜の蓄電殻\n雷狼竜の高電殻\n雷狼竜の雷電殻\n雷狼竜の逆鱗\n雷狼竜の碧玉\n雷狼竜の天玉\n獰猛化雷狼竜殻\n獰猛化雷狼竜重殻\n金雷公の甲殻\n金雷公の堅殻\n金雷公の重殻\n金雷公の帯電毛\n金雷公の高電毛\n金雷公の雷電毛\n金雷公の旋角\n金雷公の大旋角\n金雷公の極旋角\n電竜の鱗\n電竜の上鱗\n電竜の厚鱗\n電竜の棘殻\n電竜の堅棘殻\n電竜の厚棘殻\n電竜の帯電膜\n電竜の高電膜\n電竜の超電膜\n電竜の翼爪\n電竜の鋭翼爪\n電竜の剛翼爪\n電竜の冠甲\n電竜の堅冠甲\n電竜の重冠甲\n電竜の鋏尾\n電竜の鋏刃尾\n圧電甲\n高圧電甲\n超高圧電甲\n電竜の逆鱗\n電竜の雷玉\n電竜の天鱗\n獰猛化電竜鱗\n獰猛化電竜厚鱗\n青電主の厚鱗\n青電主の重棘殻\n青電主の放電棘\n巨獣の毛\n巨獣の剛毛\n巨獣の豪剛毛\n巨獣の甲殻\n巨獣の堅殻\n巨獣の重殻\n巨獣の牙\n巨獣の堅牙\n巨獣の重牙\n巨獣の鼻棘\n巨獣の剛鼻棘\n巨獣の赤毛\n雪甲塊\n雪甲大塊\n雪甲巨塊\n巨獣の頭殻\n巨獣の氷玉\n巨獣の天殻\n獰猛化巨獣毛\n獰猛化���獣剛毛\n銀嶺の剛毛\n銀嶺の重殻\n銀嶺の鼻棘\n泡狐竜の鱗\n泡狐竜の上鱗\n泡狐竜の厚鱗\n泡狐竜の紫毛\n泡狐竜の紫上毛\n泡狐竜の紫剛毛\n泡狐竜の爪\n泡狐竜の尖爪\n泡狐竜の剛爪\n泡狐竜の錦ヒレ\n泡狐竜の上錦ヒレ\n泡狐竜の特錦ヒレ\n泡狐竜の尻尾\n泡狐竜の靭尾\n泡立つ滑液\n泡立つ上滑液\n泡立つ濃滑液\n泡狐竜の逆鱗\n泡狐竜の水玉\n泡狐竜の天鱗\n獰猛化泡狐竜鱗\n獰猛化泡狐竜厚鱗\n天眼の厚鱗\n天眼の紫剛毛\n天眼の尻尾\n斬竜の鱗\n斬竜の上鱗\n斬竜の厚鱗\n斬竜の甲殻\n斬竜の堅殻\n斬竜の重殻\n斬竜の牙\n斬竜の鋭牙\n斬竜の重牙\n斬竜の炎状殻\n斬竜の焔状殻\n斬竜の獄炎状殻\n斬竜の尻尾\n斬竜の断剣尾\n斬竜の尾刃片\n赤熱した火炎嚢\n赤熱した紅焔嚢\n赤熱した焔炉嚢\n斬竜の逆鱗\n斬竜の炎玉\n斬竜の天鱗\n獰猛化斬竜鱗\n獰猛化斬竜厚鱗\n燼滅刃の鱗\n燼滅刃の上鱗\n燼滅刃の厚鱗\n燼滅刃の甲殻\n燼滅刃の堅殻\n燼滅刃の重殻\n燼滅刃の塵粉\n轟竜の鱗\n轟竜の上鱗\n轟竜の厚鱗\n轟竜の甲殻\n轟竜の堅殻\n轟竜の重殻\n轟竜の尻尾\n轟竜の靭尾\n轟竜の爪\n轟竜の尖爪\n轟竜の剛爪\n轟竜の牙\n轟竜の鋭牙\n轟竜の重牙\n轟竜の頭殻\n轟竜のアギト\n轟竜の天殻\n獰猛化轟竜鱗\n獰猛化轟竜厚鱗\n荒鉤爪の鱗\n荒鉤爪の上鱗\n荒鉤爪の厚鱗\n荒鉤爪の甲殻\n荒鉤爪の堅殻\n荒鉤爪の重殻\n荒鉤爪の蒼爪\n荒鉤爪の大蒼爪\n荒鉤爪の剛蒼爪\n千刃竜の刃鱗\n千刃竜の鋭刃鱗\n千刃竜の斬刃鱗\n千刃竜の飛刃片\n千刃竜の飛刃\n千刃竜の破刃\n千刃竜の爪\n千刃竜の刻爪\n千刃竜の閃裂爪\n千刃竜の槍尾\n千刃竜の絶槍尾\n千刃竜の刀角\n千刃竜の伐刀角\n千刃竜の断刀角\n千刃竜の翼爪\n千刃竜の尖翼爪\n千刃竜の斬翼爪\n千刃竜の反逆鱗\n千刃竜の鏡玉\n獰猛化千刃竜鱗\n獰猛化千刃竜斬鱗\n角竜の堅殻\n角竜の重殻\n角竜の殻甲\n角竜の重甲\nねじれた角\n上質なねじれた角\n大地を穿つ剛角\n角竜の牙\n角竜の尾甲\n角竜の重尾甲\n角竜の延髄\n獰猛化角竜重殻\n鏖魔の重殻\n鏖魔の重甲\n鏖魔の凄惨な角\n黒蝕竜の鱗\n黒蝕竜の上鱗\n黒蝕竜の厚鱗\n黒蝕竜の甲殻\n黒蝕竜の堅殻\n黒蝕竜の重殻\n黒蝕竜の暗翼\n黒蝕竜の上暗翼\n黒蝕竜の暗黒翼\n二律を纏う乱翼\n黒蝕竜の惨爪\n黒蝕竜の鋭惨爪\n黒蝕竜の剛惨爪\n黒蝕竜の尻尾\n黒蝕竜の靱尾\n黒蝕竜の逆鱗\n黒蝕竜の双逆鱗\n黒蝕竜の闇玉\n黒蝕竜の天鱗\n黒蝕竜の触角\n黒蝕竜の尖触角\n黒蝕竜の剛尖触角\n相克の変異角\n穢れた竜鱗\n混沌の竜鱗\n獰猛化黒蝕竜鱗\n獰猛化黒蝕竜厚鱗\n天廻龍の鱗\n天廻龍の上鱗\n天廻龍の厚鱗\n天廻龍の甲殻\n天廻龍の堅殻\n天廻龍の重殻\n天廻龍の虹翼\n天廻龍の上虹翼\n天廻龍の光虹翼\n天廻龍の浄爪\n天廻龍の鋭浄爪\n天廻龍の剛浄爪\n天廻龍の尻尾\n天廻龍の靱尾\n天廻龍の逆鱗\n天廻龍の光玉\n天廻龍の天鱗\n天廻龍の角\n天廻龍の尖角\n天廻龍の剛角\n純白の龍鱗\n金獅子の尖角\n金獅子の剛角\n金獅子の鋭牙\n金獅子の重牙\n金獅子の黒毛\n金獅子の黒荒毛\n金獅子の尖爪\n金獅子の剛爪\n金獅子の尻尾\n黄金の毛\n黄金の煌毛\n金獅子の怒髪\n金獅子の怒髪天\n金獅子の闘魂\nラージャンハート\n羅刹の金角\n羅刹の金剛角\n獰猛化金獅子毛\n獰猛化金獅子剛毛\n恐暴竜の黒鱗\n恐暴竜の厚黒鱗\n恐暴竜の滅鱗\n恐暴竜の黒皮\n恐暴竜の厚黒皮\n血戦の漆黒皮\n恐暴竜の大牙\n恐暴竜の重牙\n極悪な牙\n恐暴竜の鉤爪\n恐暴竜の剛鉤爪\n恐暴竜の頭殻\n恐暴竜の尻尾\n恐暴竜の重尾\n恐暴竜の唾液\nドス黒い血\n歴戦の漆黒皮\n恐暴竜の宝玉\n獰猛化恐暴竜鱗\n獰猛化恐暴竜厚鱗\nキリンの雷角\nキリンの皮\nキリンの上皮\nキリンの特上皮\nキリンのたてがみ\n白銀のたてがみ\nキリンの雷尾\nキリンの靱雷尾\nキリンの蒼角\nキリンの剛蒼角\n鋼龍の甲殻\n鋼龍の堅殻\n鋼龍の重殻\n鋼の龍鱗\n鋼の上龍鱗\n鋼の厚龍鱗\n鋼龍の翼膜\n鋼龍の剛翼\n鋼龍の角\n鋼龍の剛角\n鋼龍の尖角\n鋼龍の尻尾\n鋼龍の靱尾\n鋼龍の爪\n鋼龍の尖爪\n鋼龍の剛爪\n鋼龍の宝玉\n古龍の大宝玉\n霞龍の皮\n霞龍の上皮\n霞龍の特上皮\n霞龍の角\n霞龍の尖角\n霞龍の剛角\n霞龍の爪\n霞龍の尖爪\n霞龍の剛爪\n霞龍の翼膜\n霞龍の剛翼\n霞龍の尻尾\n霞龍の靱尾\n霞龍の宝玉\n炎王龍の甲殻\n炎王龍の堅殻\n炎王龍の重殻\n炎王龍のたてがみ\n炎王龍の尻尾\n炎王龍の靱尾\n炎王龍の角\n炎王龍の尖角\n炎王龍の剛角\n炎の龍鱗\n獄炎の龍鱗\n獄炎の厚龍鱗\n炎龍の爪\n炎龍の尖爪\n炎龍の剛爪\n炎龍の翼膜\n炎龍の塵粉\n炎龍の宝玉\n大竜結晶\n巨竜結晶\n覇竜の上鱗\n覇竜の厚鱗\n覇竜の堅殻\n覇竜の重殻\n覇竜の尻尾\n覇竜の重尾\n覇竜の剛爪\n覇竜の剛裂爪\n覇竜の大牙\n覇竜の極大牙\n覇竜の大棘\n覇竜の重大棘\n覇竜の宝玉\n覇導玉\n崩竜の堅殻\n崩竜の重殻\n崩竜の腹鱗\n崩竜の厚腹鱗\n崩竜の尻尾\n崩竜の重尾\n崩竜の穿爪\n崩竜の剛穿爪\n崩竜の削顎\n崩竜の重削顎\n崩竜の上ヒレ\n崩竜の剛ヒレ\n崩竜の宝玉\n崩天玉\n煌黒龍の堅逆殻\n煌黒龍の天殻\n煌黒龍の逆鱗\n煌黒龍の天鱗\n煌黒龍の尖爪\n煌黒龍の凶爪\n煌黒龍の翼膜\n煌黒龍の邪翼\n煌黒龍の尻尾\n煌黒龍の妖尾\n砕けた天角\n天をつらぬく角\n天を統べる角\n瑠璃色の龍玉\n瑠璃色の龍神玉\n嵐龍の堅殻\n嵐龍の重殻\n嵐龍の飛膜\n嵐龍の厚飛膜\n嵐龍の角\n嵐龍の剛角\n嵐龍の鋭爪\n嵐龍の剛爪\n嵐龍の尻尾\n嵐龍の凄尾\n嵐龍の胸殻\n嵐龍の重胸殻\n嵐気胞\n嵐気胞塊\n天空の龍玉\n天空の龍神玉\n龍薬石\n老山龍の厚鱗\n老山龍の重殻\n老山龍の剛角\n老山龍の巨爪\n老山龍の天鱗\n黒龍の厚鱗\n黒龍の重殻\n黒龍の剛角\n黒龍の邪眼\n黒龍の剛翼\n黒龍の紅焔鱗\n黒龍の紅焔殻\n黒龍の紅焔角\n黒龍の紅焔翼\n黒龍の魔神眼\n祖龍の厚白鱗\n祖龍の重殻\n祖龍の剛角\n祖龍の剛翼\n祖龍の霊眼\n骸体殻\n堅骸体殻\n重骸体殻\n骸棘殻\n尖骸棘殻\n剛骸棘殻\n骸頭骨\n重骸頭骨\n骸椎骨\n重骸椎骨\n骸龍の青斑皮\n骸龍の鮮青斑皮\n骸龍の口腕甲\n骸龍の恐口腕甲\n骸龍の喰砕牙\n骸龍の烏賊骨\n骸龍の烏賊巨骨\n骸龍の残魄玉\n骸龍の残魄秘玉\n発光する粘液\n発光する上粘液\n発光する濃粘液\n天彗龍の上鱗\n天彗龍の厚鱗\n天彗龍の堅殻\n天彗龍の重殻\n天彗龍の尖爪\n天彗龍の剛爪\n天彗龍の尻尾\n天彗龍の旋尾\n天彗龍の槍翼\n天彗龍の撃槍翼\n天彗龍の背尖甲\n天彗龍の大背尖甲\n赤色の龍氣玉\n赫色の龍氣玉\n灼けた甲殻\n赫い龍液\n金色の絲\n閣蟷螂の金殻\n閣蟷螂の紫藍殻\n閣蟷螂の雅鎌刃\n虹色に煌めく背甲\n閣蟷螂の香液\n閣蟷螂の美棘\n閣蟷螂の麗眩玉\n玉座の輝石\n地図\n応急薬\n応急薬グレード\n携帯食料\n携帯肉焼きセット\n携帯砥石\n携帯シビレ罠\n支給専用閃光玉\n支給専用音爆弾\n支給専用秘薬\n支給専用生命の粉塵\n支給専用大粉塵\n支給専用落とし穴\n支給専用大タル爆弾\n支給専用狩技ドリンク\nバリスタの弾\n単発式拘束弾\n対巨龍爆弾\n高密度滅龍炭\nネコタクチケット\n支給専用モドリ玉\nさびた破片\n太古の破片\n神代の破片\n禍々しい布\n禍々しい闇布\n禍々しい冥布\n豪華な遺物\n超豪華な遺物\n超絶豪華な遺物\n欠けた石像\n欠けた大石像\n欠けた猫神像\n黒いかけら\n黒い塊\nアイール茶釜\nユクモ白玉粉\nぬいぐるみセット\n謎の武器の秘伝書\n謎の重弩の秘伝書\nタル用特製木材\n太古の注連縄\n蝕まれた琥珀\n混濁した欠片\n奇面な仮面\nサンマージ結晶\n大海原の輝石\nふんわり白毛玉\nふんわり黒毛玉\n防具合成材・頭\n防具合成材・胴\n防具合成材・腕\n防具合成材・腰\n防具合成材・脚\nオトモ防具合成材・頭\nオトモ防具合成材・胴\nお食事券\n高級お食事券\n勇気の証\n勇気の証Ｇ\n勇気の証ＸＸ\n希望の証\n希望の証Ｇ\n希望の証ＸＸ\n才能の証\n不屈の証\n不屈の証Ｇ\n覇王の証\n肉球のスタンプ\n肉球の優待券\nベルナチケット\nベルナチケットＧ\nココットチケット\nココットチケットＧ\nポッケチケット\nポッケチケットＧ\nユクモチケット\nユクモチケットＧ\n龍歴院チケット\n龍歴院チケットＧ\n龍識船のチケット\n酒場チケット\nオトモチケット\nオトモチケットＧ\n飛行船チケット\n飛行船チケットＧ\nビストロチケット\nビストロチケットＧ\n交易チケット\n足湯チケット\nギルドチケット\nギルドチケットＧ\nクロオビチケット\nタツジンチケット\nタツジンチケットＧ\nデンセツチケット\nデンセツチケットＧ\n山菜組引換券\n山菜組引換券Ｇ\n鋼の山菜組引換券\n銀の山菜組引換券\n金の山菜組引換券\n天の山菜組引換券\nEX火竜チケット\nEX火竜チケットＳ\nEX溶岩竜チケット\nEX轟竜チケット\nEX轟竜チケットＳ\nEX雷狼竜チケット\nEX砕竜チケット\nEX黒蝕竜チケット\nEX天廻龍チケット\nEX鋼龍チケット\nEX霞龍チケット\nEX炎王龍チケット\nEX金火竜チケット\nEX銀火竜チケット\nEX桃毛獣チケット\nEX老山龍チケット\nEX黒龍チケット・紅\nEX黒龍チケット・白\nEX老山龍チケットＳ\n獰猛化狩猟の証Ⅰ\n獰猛化狩猟の証Ⅱ\n獰猛化狩猟の証Ⅲ\n獰猛化狩猟の証Ⅳ\n獰猛化狩猟の証Ⅴ\n獰猛化狩猟の証Ⅵ\n紅兜狩猟の証１\n紅兜狩猟の証２\n紅兜狩猟の証３\n紅兜狩猟の証４\n紅兜狩猟の証５\n紅兜狩猟の証６\n紅兜狩猟の証７\n紅兜狩猟の証８\n紅兜狩猟の証９\n紅兜狩猟の証10\n紅兜狩猟の証11\n紅兜狩猟の証12\n紅兜狩猟の証13\n紅兜狩猟の証14\n紅兜狩猟の証15\n大雪主狩猟の証１\n大雪主狩猟の証２\n大雪主狩猟の証３\n大雪主狩猟の証４\n大雪主狩猟の証５\n大雪主狩猟の証６\n大雪主狩猟の証７\n大雪主狩猟の証８\n大雪主狩猟の証９\n大雪主狩猟の証10\n大雪主狩猟の証11\n大雪主狩猟の証12\n大雪主狩猟の証13\n大雪主狩猟の証14\n大雪主狩猟の証15\n矛砕狩猟の証１\n矛砕狩猟の証２\n矛砕狩猟の証３\n矛砕狩猟の証４\n矛砕狩猟の証５\n矛砕狩猟の証６\n矛砕狩猟の証７\n矛砕狩猟の証８\n矛砕狩猟の証９\n矛砕狩猟の証10\n矛砕狩猟の証11\n矛砕狩猟の証12\n矛砕狩猟の証13\n矛砕狩猟の証14\n矛砕狩猟の証15\n紫毒姫狩猟の証１\n紫毒姫狩猟の証２\n紫毒姫狩猟の証３\n紫毒姫狩猟の証４\n紫毒姫狩猟の証５\n紫毒姫狩猟の証６\n紫毒姫狩猟の証７\n紫毒姫狩猟の証８\n紫毒姫狩猟の証９\n紫毒姫狩猟の証10\n紫毒姫狩猟の証11\n紫毒姫狩猟の証12\n紫毒姫狩猟の証13\n紫毒姫狩猟の証14\n紫毒姫狩猟の証15\n岩穿狩猟の証１\n岩穿狩猟の証２\n岩穿狩猟の証３\n岩穿狩猟の証４\n岩穿狩猟の証５\n岩穿狩猟の証６\n岩穿狩猟の証７\n岩穿狩猟の証８\n岩穿狩猟の証９\n岩穿狩猟の証10\n岩穿狩猟の証11\n岩穿狩猟の証12\n岩穿狩猟の証13\n岩穿狩猟の証14\n岩穿狩猟の証15\n白疾風狩猟の証１\n白疾風狩猟の証２\n白疾風狩猟の証３\n白疾風狩猟の証４\n白疾風狩猟の証５\n白疾風狩猟の証６\n白疾風狩猟の証７\n白疾風狩猟の証８\n白疾風狩猟の証９\n白疾風狩猟の証10\n白疾風狩猟の証11\n白疾風狩猟の証12\n白疾風狩猟の証13\n白疾風狩猟の証14\n白疾風狩猟の証15\n宝纏狩猟の証１\n宝纏狩猟の証２\n宝纏狩猟の証３\n宝纏狩猟の証４\n宝纏狩猟の証５\n宝纏狩猟の証６\n宝纏狩猟の証７\n宝纏狩猟の証８\n宝纏狩猟の証９\n宝纏狩猟の証10\n宝纏狩猟の証11\n宝纏狩猟の証12\n宝纏狩猟の証13\n宝纏狩猟の証14\n宝纏狩猟の証15\n隻眼狩猟の証１\n隻眼狩猟の証２\n隻眼狩猟の証３\n隻眼狩猟の証４\n隻眼狩猟の証５\n隻眼狩猟の証６\n隻眼狩猟の証７\n隻眼狩猟の証８\n隻眼狩猟の証９\n隻眼狩猟の証10\n隻眼狩猟の証11\n隻眼狩猟の証12\n隻眼狩猟の証13\n隻眼狩猟の証14\n隻眼狩猟の証15\n黒炎王狩猟の証１\n黒炎王狩猟の証２\n黒炎王狩猟の証３\n黒炎王狩猟の証４\n黒炎王狩猟の証５\n黒炎王狩猟の証６\n黒炎王狩猟の証７\n黒炎王狩猟の証８\n黒炎王狩猟の証９\n黒炎王狩猟の証10\n黒炎王狩猟の証11\n黒炎王狩猟の証12\n黒炎王狩猟の証13\n黒炎王狩猟の証14\n黒炎王狩猟の証15\n金雷公狩猟の証１\n金雷公狩猟の証２\n金雷公狩猟の証３\n金雷公狩猟の証４\n金雷公狩猟の証５\n金雷公狩猟の証６\n金雷公狩猟の証７\n金雷公狩猟の証８\n金雷公狩猟の証９\n金雷公狩猟の証10\n金雷公狩猟の証11\n金雷公狩猟の証12\n金雷公狩猟の証13\n金雷公狩猟の証14\n金雷公狩猟の証15\n荒鉤爪狩猟の証１\n荒鉤爪狩猟の証２\n荒鉤爪狩猟の証３\n荒鉤爪狩猟の証４\n荒鉤爪狩猟の証５\n荒鉤爪狩猟の証６\n荒鉤爪狩猟の証７\n荒鉤爪狩猟の証８\n荒鉤爪狩猟の証９\n荒鉤爪狩猟の証10\n荒鉤爪狩猟の証11\n荒鉤爪狩猟の証12\n荒鉤爪狩猟の証13\n荒鉤爪狩猟の証14\n荒鉤爪狩猟の証15\n燼滅刃狩猟の証１\n燼滅刃狩猟の証２\n燼滅刃狩猟の証３\n燼滅刃狩猟の証４\n燼滅刃狩猟の証５\n燼滅刃狩猟の証６\n燼滅刃狩猟の証７\n燼滅刃狩猟の証８\n燼滅刃狩猟の証９\n燼滅刃狩猟の証10\n燼滅刃狩猟の証11\n燼滅刃狩猟の証12\n燼滅刃狩猟の証13\n燼滅刃狩猟の証14\n燼滅刃狩猟の証15\n朧隠狩猟の証１\n朧隠狩猟の証２\n朧隠狩猟の証３\n朧隠狩猟の証４\n朧隠狩猟の証５\n鎧裂狩猟の証１\n鎧裂狩猟の証２\n鎧裂狩猟の証３\n鎧裂狩猟の証４\n鎧裂狩猟の証５\n天眼狩猟の証１\n天眼狩猟の証２\n天眼狩猟の証３\n天眼狩猟の証４\n天眼狩猟の証５\n青電主狩猟の証１\n青電主狩猟の証２\n青電主狩猟の証３\n青電主狩猟の証４\n青電主狩猟の証５\n銀嶺狩猟の証１\n銀嶺狩猟の証２\n銀嶺狩猟の証３\n銀嶺狩猟の証４\n銀嶺狩猟の証５\n鏖魔狩猟の証１\n鏖魔狩猟の証２\n鏖魔狩猟の証３\n鏖魔狩猟の証４\n鏖魔狩猟の証５\nロイヤルハニー\n特産キノコ\n厳選キノコ\n熟成キノコ\nドスマツタケ\n深層シメジ\n特産タケノコ\n熱帯イチゴ\n雪山草\n特産ゼンマイ\n厳選ゼンマイ\n黄金魚\n白金魚\n錦魚\n王錦魚\nトロサシミウオ\nロイヤルカブト\nゴッドカブト\n銀色コオロギ\n金色コオロギ\n不老蛾\n大不老蛾\n黄金石のかけら\n黄金石の塊\n花香石のかけら\n花香石の塊\n竜琥珀のかけら\n竜琥珀の塊\n竜骨結晶\n血石\n深血石\n燃石炭\n強燃石炭\n化石骨\n朽ちた龍鱗\nホワイトレバー\n垂皮油\n秘密のポーチ\nまんまるドングリ\nきれいな腹袋\n輝く腹袋\nモンスターのキモ\n魚竜のキモ\nポポノタン\nアプケロスのキモ\n古代木の実\n深睡蓮の根\n深睡蓮の塊根\n雲羊鹿の天然毛\nきれいな貝殻\n棘星石\n高層エリンギ\nガーグァの卵\nガーグァの金の卵\n竜の卵\n灰水晶の原石\n白水晶の原石\n火薬岩\n肉食竜の卵\n隕石の大塊\n久遠の化石\n草食竜の卵\n大砲の弾\nギルドフラッグ\nガーグァのフン\nなわばりのフン\nなわばりの大フン\n兵隊のフェロモン\n女王のフェロモン\nガマのナミダ\nガマの大粒ナミダ\nザザミソ\n極上ザザミソ\nヤド真珠\n極上ヤド真珠\n竜のナミダ\n竜の大粒ナミダ\n牙獣のナミダ\n牙獣の大粒ナミダ\n龍秘宝\nいにしえの龍秘宝\n狂竜結晶の欠片\n狂竜結晶\n禍々しい狂竜結晶\nフルフルベビー\nフルフルコイン\nガララコイン\nレウスコイン\nケチャコイン\nガノスコイン\nブラキコイン\nゲリョスコイン\nドスコイン\nガルルガコイン\nガンキンコイン\nレギオスコイン\nカブラコイン\nババコイン\nホーンズコイン\n素朴な端材\n素朴な上端材\n素朴な重端材\n粋な端材\n粋な上端材\n粋な重端材\n鉱石の端材\n鉱石の上端材\n鉱石の重端材\n虫の端材\n虫の上端材\n虫の重端材\n骨の端材\n骨の上端材\n骨の重端材\n木の端材\n木の上端材\n木の重端材\n毛皮の端材\n毛皮の上端材\n毛皮の重端材\n草食竜の端材\n草食竜の上端材\n草食竜の重端材\n垂皮竜の上端材\n飛甲虫の端材\n飛甲虫の上端材\n飛甲虫の重端材\n狗竜の端材\n狗竜の上端材\n狗竜の重端材\n跳狗竜の端材\n跳狗竜の上端材\n跳狗竜の重端材\nランポスの端材\nランポスの上端材\nランポスの重端材\nギアノスの上端材\nギアノスの重端材\nゲネポスの端材\nゲネポスの上端材\nゲネポスの重端材\nイーオスの端材\nイーオスの上端材\nイーオスの重端材\n青熊獣の端材\n青熊獣の上端材\n青熊獣の重端材\n紅兜の端材\n紅兜の銘端材\n紅兜の真端材\n紅兜の天端材\n白兎獣の端材\n白兎獣の上端材\n白兎獣の重端材\n大雪主の端材\n大雪主の銘端材\n大雪主の真端材\n大雪主の天端材\n赤甲獣の端材\n赤甲獣の上端材\n赤甲獣の重端材\n怪鳥の端材\n怪鳥の上端材\n怪鳥の重端材\n怪鳥の猛端材\n怪鳥の獰端材\n毒怪鳥の端材\n毒怪鳥の上端材\n毒怪鳥の重端材\n毒怪鳥の猛端材\n毒怪鳥の獰端材\n夜鳥の端材\n夜鳥の上端材\n夜鳥の重端材\n夜鳥の猛端材\n夜鳥の獰端材\n朧隠の真端材\n朧隠の天端材\n黒狼鳥の端材\n黒狼鳥の上端材\n黒狼鳥の重端材\n黒狼鳥の猛端材\n黒狼鳥の獰端材\n隻眼の端材\n隻眼の銘端材\n隻眼の真端材\n隻眼の天端材\n大猪の端材\n大猪の上端材\n大猪の重端材\n桃毛獣の上端材\n桃毛獣の重端材\n桃毛獣の獰端材\n雪獅子の端材\n雪獅子の上端材\n雪獅子の重端材\n雪獅子の猛端材\n雪獅子の獰端材\n奇猿狐の上端材\n奇猿狐の重端材\n奇猿狐の猛端材\n奇猿狐の獰端材\n砂竜の端材\n砂竜の上端材\n砂竜の重端材\n水竜の上端材\n水竜の重端材\n水竜の猛端材\n水竜の獰端材\n溶岩竜の上端材\n溶岩竜の重端材\n溶岩竜の猛端材\n溶岩竜の獰端材\n水獣の端材\n水獣の上端材\n水獣の重端材\n水獣の猛端材\n水獣の獰端材\n潜口竜の端材\n潜口竜の上端材\n潜口竜の重端材\n潜口竜の猛端材\n潜口竜の獰端材\n海竜の端材\n海竜の上端材\n海竜の重端材\n海竜の猛端材\n海竜の獰端材\n炎戈竜の上端材\n炎戈竜の重端材\n炎戈竜の猛端材\n炎戈竜の獰端材\n鬼蛙の端材\n鬼蛙の上端材\n鬼蛙の重端材\n鬼蛙の猛端材\n鬼蛙の獰端材\n岩穿の端材\n岩穿の銘端材\n岩穿の真端材\n岩穿の天端材\n化け鮫の上端材\n化け鮫の重端材\n化け鮫の猛端材\n化け鮫の獰端材\n絞蛇竜の端材\n絞蛇竜の上端材\n絞蛇竜の重端材\n絞蛇竜の猛端材\n絞蛇竜の獰端材\n盾蟹の端材\n盾蟹の上端材\n盾蟹の重端材\n盾蟹の猛端材\n盾蟹の獰端材\n矛砕の端材\n矛砕の銘端材\n矛砕の真端材\n矛砕の天端材\n鎌蟹の端材\n鎌蟹の上端材\n鎌蟹の重端材\n鎌蟹の猛端材\n鎌蟹の獰端材\n鎧裂の真端材\n鎧裂の天端材\n影蜘蛛の上端材\n影蜘蛛の重端材\n影蜘蛛の獰端材\n重甲虫の上端材\n重甲虫の重端材\n重甲虫の猛端材\n重甲虫の獰端材\n土砂竜の上端材\n土砂竜の重端材\n土砂竜の獰端材\n爆鎚竜の端材\n爆鎚竜の上端材\n爆鎚竜の重端材\n爆鎚竜の猛端材\n爆鎚竜の獰端材\n宝纏の端材\n宝纏の銘端材\n宝纏の真端材\n宝纏の天端材\n砕竜の端材\n砕竜の上端材\n砕竜の重端材\n砕竜の猛端材\n砕竜の獰端材\n尾槌竜の上端材\n尾槌竜の重端材\n尾槌竜の猛端材\n尾槌竜の獰端材\nブヨブヨした端材\n真珠色の上端材\n真珠色の重端材\n真珠色の猛端材\n真珠色の獰端材\n迅竜の端材\n迅竜の上端材\n迅竜の重端材\n迅竜の猛端材\n迅竜の獰端材\n白疾風の端材\n白疾風の銘端材\n白疾風の真端材\n白疾風の天端材\n氷牙竜の上端材\n氷牙竜の重端材\n氷牙竜の獰端材\n岩竜の上端材\n岩竜の重端材\n岩竜の獰端材\n鎧竜の上端材\n鎧竜の重端材\n鎧竜の獰端材\n雌火竜の端材\n雌火竜の上端材\n雌火竜の重端材\n雌火竜の猛端材\n雌火竜の獰端材\n紫毒姫の端材\n紫毒姫の銘端材\n紫毒姫の真端材\n紫毒姫の天端材\n火竜の端材\n火竜の上端材\n火竜の重端材\n火竜の猛端材\n火竜の獰端材\n黒炎王の端材\n黒炎王の銘端材\n黒炎王の真端材\n黒炎王の天端材\n雷狼竜の端材\n雷狼竜の上端材\n雷狼竜の重端材\n雷狼竜の猛端材\n雷狼竜の獰端材\n金雷公の端材\n金雷公の銘端材\n金雷公の真端材\n金雷公の天端材\n電竜の端材\n電竜の上端材\n電竜の重端材\n電竜の猛端材\n電竜の獰端材\n青電主の真端材\n青電主の天端材\n巨獣の端材\n巨獣の上端材\n巨獣の重端材\n巨獣の猛端材\n巨獣の獰端材\n銀嶺の真端材\n銀嶺の天端材\n泡狐竜の端材\n泡狐竜の上端材\n泡狐竜の重端材\n泡狐竜の猛端材\n泡狐竜の獰端材\n天眼の真端材\n天願の天端材\n斬竜の端材\n斬竜の上端材\n斬竜の重端材\n斬竜の猛端材\n斬竜の獰端材\n燼滅刃の端材\n燼滅刃の銘端材\n燼滅刃の真端材\n燼滅刃の天端材\n轟竜の端材\n轟竜の上端材\n轟竜の重端材\n轟竜の猛端材\n轟竜の獰端材\n荒鉤爪の端材\n荒鉤爪の銘端材\n荒鉤爪の真端材\n荒鉤爪の天端材\n千刃竜の端材\n千刃竜の上端材\n千刃竜の重端材\n千刃竜の猛端材\n千刃竜の獰端材\n角竜の上素材\n角竜の上素材\n角竜の獰素材\n鏖魔の真素材\n鏖魔の天素材\n黒蝕竜の端材\n黒蝕竜の上端材\n黒蝕竜の重端材\n黒蝕竜の猛端材\n黒蝕竜の獰端材\n渾沌の重素材\n天廻龍の端材\n天廻龍の上端材\n天廻龍の重端材\n金獅子の上端材\n金獅子の重端材\n金獅子の猛端材\n金獅子の獰端材\n恐暴竜の上端材\n恐暴竜の重端材\n恐暴竜の猛端材\n恐暴竜の獰端材\nキリンの端材\nキリンの上端材\nキリンの重端材\n鋼龍の端材\n鋼龍の上端材\n鋼龍の重端材\n霞龍の端材\n霞龍の上端材\n霞龍の重端材\n炎王龍の端材\n炎王龍の上端材\n炎王龍の重端材\n覇竜の上端材\n覇竜の重端材\n崩竜の上端材\n崩竜の重端材\n煌黒龍の上端材\n煌黒龍の重端材\n嵐龍の上端材\n嵐龍の重端材\n老山龍の重端材\n黒龍の重端材\n黒龍の紅重端材\n祖龍の重端材\n骸の端材\n骸の上端材\n骸の重端材\n骸龍の上端材\n骸龍の重端材\n天彗龍の上端材\n天彗龍の重端材\n閣蟷螂の重端材\n獰猛な端材\n獰猛な猛端材\n獰猛な獰端材\n獰猛な獰猛端材\n異形の端材\n異形の銘端材\n異形の真端材\n雌火竜の？？？？\n金火竜の？？？？\n紫毒姫の？？？？\n火竜の？？？？？\n銀火竜の？？？？\n黒炎王の？？？？\nブヨブヨした？？\n怪鳥の？？？？？\n毒怪鳥の？？？？\n水竜の？？？？？\nキリンの？？？？\nドスランポスの？\nドスゲネポスの？\nドスイーオスの？\nドスガレオスの？\n黒狼鳥の？？？？\n隻眼の？？？？？\n盾蟹の？？？？？\n矛砕の？？？？？\n鎌蟹の？？？？？\n雪獅子の？？？？\n金獅子の？？？？\n激昂金獅子の？？\n鋼龍の？？？？？\n霞龍の？？？？？\n炎王龍の？？？？\n大猪の？？？？？\n轟竜の？？？？？\n荒鉤爪の？？？？\n覇竜の？？？？？\n溶岩竜の？？？？\n迅竜の？？？？？\n白疾風の？？？？\n崩竜の？？？？？\n恐暴竜の？？？？\n怒喰恐暴竜の？？\n爆鎚竜の？？？？\n宝纏の？？？？？\n海竜の？？？？？\n水獣の？？？？？\n炎戈竜の？？？？\n煌黒龍の？？？？\n尾槌竜の？？？？\n潜口竜の？？？？\n雷狼竜の？？？？\n金雷公の？？？？\n嵐龍の？？？？？\n青熊獣の？？？？\n紅兜の？？？？？\n白兎獣の？？？？\n大雪主の？？？？\n赤甲獣の？？？？\n砕竜の？？？？？\n奇猿狐の？？？？\n鬼蛙の？？？？？\n岩穿の？？？？？\n化け鮫の？？？？\n絞蛇竜の？？？？\n重甲虫の？？？？\n黒蝕竜の？？？？\n天廻龍の？？？？\n徹甲虫の？？？？\n千刃竜の？？？？\n夜鳥の？？？？？\n斬竜の？？？？？\n燼滅刃の？？？？\n電竜の？？？？？\n泡狐竜の？？？？\n巨獣の？？？？？\n骸龍の？？？？？\n跳狗竜の？？？？\nアプトノスの？？\nアプケロスの？？\nケルビの？？？？\nモスの？？？？？\nカンタロスの？？\nランゴスタの？？\nランポスの？？？\nゲネポスの？？？\nイーオスの？？？\n砂竜の？？？？？\nファンゴの？？？\nポポの？？？？？\nギアノスの？？？\nガウシカの？？？\n翼蛇竜の？？？？\nヤオザミの？？？\nガミザミの？？？\nブランゴの？？？\nリノプロスの？？\n飛甲虫の？？？？\n甲虫の？？？？？\nジャギィの？？？\nジャギィノスの？\n水生獣の？？？？\n溶岩獣の？？？？\n垂皮竜の？？？？\nガーグァの？？？\nスクアギルの？？\n盾虫の？？？？？\nマッカォの？？？\n首鳴竜の？？？？\n雲羊鹿の？？？？\n岩竜の？？？？？\n鎧竜の？？？？？\n角竜の？？？？？\n鏖魔の？？？？？\n老山龍の？？？？\n黒龍の？？？？？\n黒龍の紅い？？？\n祖龍の？？？？？\n鎧裂の？？？？？\n桃毛獣の？？？？\nドスギアノスの？\n氷牙竜の？？？？\n土砂竜の？？？？\n影蜘蛛の？？？？\n渾沌の？？？？？\n猛爆砕竜の？？？\n朧隠の？？？？？\n青電主の？？？？\n天眼の？？？？？\n銀嶺の？？？？？\n天彗龍の？？？？\n蠢く墟城の？？？\n閣蟷螂の？？？？\nコンガの？？？？\n大雷光虫の？？？\nアキンドングリ\n大アキンドングリ\n豪アキンドングリ\n超特訓の指南書\n超特訓の秘伝書\n超特訓の奥義書\nネコ記憶の秘伝書\n古びたバリスタ弾\n耐毒珠【１】\n耐毒珠【２】\n耐麻珠【１】\n耐麻珠【２】\n耐眠珠【１】\n耐眠珠【２】\n耐絶珠【１】\n制絶珠【１】\n防音珠【１】\n防音珠【３】\n防風珠【１】\n防風珠【２】\n耐震珠【１】\n抗震珠【１】\n耐達磨珠【１】\n抗達磨珠【１】\n耐暑珠【１】\n耐寒珠【１】\n北風珠【１】\n北風珠【３】\n南風珠【１】\n南風珠【３】\n耐盗珠【１】\n耐防珠【１】\n抗狂珠【１】\n抗狂珠【３】\n菌学珠【１】\n菌究珠【１】\n抗傷珠【１】\n攻撃珠【１】\n攻撃珠【２】\n攻撃珠【３】\n防御珠【１】\n防御珠【２】\n体力珠【１】\n耐火珠【１】\n制火珠【１】\n耐水珠【１】\n制水珠【１】\n耐雷珠【１】\n制雷珠【１】\n耐氷珠【１】\n制氷珠【１】\n耐龍珠【１】\n制龍珠【１】\n属耐珠【１】\n属耐珠【３】\n火炎珠【１】\n火炎珠【２】\n流水珠【１】\n流水珠【２】\n雷光珠【１】\n雷光珠【２】\n氷結珠【１】\n氷結珠【２】\n破龍珠【１】\n破龍珠【２】\n属攻珠【１】\n属攻珠【３】\n特攻珠【１】\n特攻珠【２】\n研磨珠【１】\n匠珠【２】\n匠珠【３】\n斬鉄珠【１】\n斬鉄珠【３】\n剣豪珠【１】\n剣豪珠【３】\n剛刃珠【１】\n剛刃珠【３】\n鈍器珠【１】\n鈍器珠【２】\n抜刀珠【１】\n抜刀珠【２】\n抜打珠【１】\n抜打珠【３】\n速納珠【１】\n速納珠【２】\n納研珠【１】\nダミー珠１\nダミー珠２\n刃鱗珠【１】\nダミー珠３\n刃鱗珠【３】\n早填珠【１】\n早填珠【２】\n抑反珠【１】\n抑反珠【３】\n点射珠【１】\n強弾珠【１】\n強弾珠【３】\n貫通珠【１】\n貫通珠【３】\n散弾珠【１】\n散弾珠【３】\n重弾珠【１】\n重弾珠【３】\n加弾珠【１】\n加弾珠【２】\n加貫珠【１】\n加散珠【１】\n加榴珠【１】\n加拡珠【１】\n加拡珠【３】\n毒瓶珠【１】\n痺瓶珠【１】\n痺瓶珠【２】\n眠瓶珠【１】\n強瓶珠【１】\n強瓶珠【２】\n属瓶珠【１】\n属瓶珠【２】\n接瓶珠【１】\n減瓶珠【１】\n爆瓶珠【１】\n速射珠【１】\n速射珠【３】\n射法珠【１】\n射法珠【２】\n装填珠【２】\n装填珠【３】\n変射珠【１】\n節弾珠【１】\n節弾珠【２】\n達人珠【１】\n達人珠【２】\n達人珠【３】\n痛撃珠【１】\n痛撃珠【３】\n連撃珠【１】\n連撃珠【３】\n特会珠【１】\n特会珠【２】\n属会珠【１】\n属会珠【２】\n会心珠【１】\n会心珠【３】\n裏会心珠【１】\nダミー珠４\n裏会心珠【３】\n短縮珠【１】\n短縮珠【３】\n強走珠【１】\n強走珠【３】\n体術珠【１】\n体術珠【２】\n早気珠【１】\n早気珠【２】\n走継珠【１】\n走継珠【２】\nダミー珠５\n回避珠【１】\n回避珠【２】\n跳躍珠【１】\n跳躍珠【３】\n泡沫珠【１】\n泡沫珠【３】\n鉄壁珠【１】\n鉄壁珠【２】\n強壁珠【１】\n強壁珠【２】\nＫＯ珠【１】\nＫＯ珠【２】\n奪気珠【１】\n奪気珠【２】\n鼓笛珠【１】\n砲術珠【１】\n重撃珠【１】\n重撃珠【３】\n爆師珠【１】\n全開珠【１】\n全開珠【２】\n闘魂珠【１】\n闘魂珠【２】\n無傷珠【１】\n無傷珠【２】\n好機珠【１】\n好機珠【３】\n龍気珠【１】\nダミー珠６\n龍気珠【３】\n底力珠【１】\n底力珠【２】\n逆境珠【１】\n逆境珠【２】\n逆上珠【１】\n逆上珠【２】\n窮地珠【１】\n窮地珠【２】\n根性珠【１】\n根性珠【２】\n忍脚珠【１】\n采配珠【１】\n名采配珠【１】\n号令珠【１】\n号令珠【２】\n乗慣珠【１】\n飛燕珠【１】\n無心珠【１】\n無心珠【３】\n我慢珠【１】\nダミー珠７\nダミー珠８\n技延珠【１】\n技延珠【１】\nダミー珠９\n千里珠【１】\n観察珠【１】\n狩人珠【１】\n運搬珠【１】\n加護珠【１】\n神護珠【１】\n英雄珠【１】\n英雄珠【３】\n治癒珠【１】\n治癒珠【２】\n早復珠【１】\n早復珠【２】\n持続珠【１】\n友愛珠【１】\n友愛珠【２】\n無食珠【１】\n食漢珠【１】\n早食珠【１】\n早食珠【３】\n節食珠【１】\n肉食珠【１】\n肉好珠【１】\n茸好珠【１】\n野草珠【１】\n博士珠【１】\n弾製珠【１】\n罠師珠【１】\n採取珠【１】\n蜜集珠【１】\n蜜占珠【１】\n護石珠【１】\n護石珠【３】\n祝福珠【１】\n運気珠【１】\n運気珠【３】\n皮剥珠【１】\n皮剥珠【３】\n捕獲珠【１】\n捕獲珠【３】\n歴鈴珠【１】\n始猟珠【１】\n雪花珠【１】\n仙湯珠【１】\n識究珠【１】\n空宴珠【１】\nダミー珠１０\nダミー珠１１\nダミー珠１２\nダミー珠１３\nダミー珠１４\nダミー珠１５\nダミー珠１６\nダミー珠１７\nダミー珠１８\nダミー珠１９\nダミー珠２０\nトマトジュース\n妖精の尻尾の紋章\n海賊Ｊネコ金貨\nダンボール\nユニクロコイン\nスタジオパス\nぐでぐでとした卵\n魂石\nクローズコイン\n自転車部入部届\n地下闘技場入場券\nじーさんコイン\nコロコロチケット\nうしおコイン\nマギコイン\n冥天の星くず\n運命のカード\n海賊Ｊチケット\nファミ通チケット\nデンゲキチケット\nユニクロＳコイン\nスタジオＸパス\nスタジオＧパス\nスタジオＷパス\nしゃけのきりみ\nマクロスΔコイン\n風のタクト\nアーウィン搭乗券\nスーパーキノコ\nデザインパレット\nトライフォース\nサムスコイン\n女神の眼差し\n女神の抱擁\nＳＦコイン\nレッドオーブ\nセラミカルチタン\n英雄の証\nベビー日記帳\nぽかぽか日記帳\nモンハン部会報誌\nモンハン部入部届\nモンハン部認定証\nパペットチケット\nグレートストーン\n郵便屋さんの手紙\n";
	public static void parseItemList(){
		//parseItemList_v2();
	    itemList = inputString.split("\n");
	}
	
//	public static void parseItemList_v2(){
//		try(BufferedReader br = new BufferedReader(new FileReader("db/MHXX_item(uni).txt"))) {
//		    StringBuilder sb = new StringBuilder();
//		    String line = br.readLine();
//		    String str = "";
//		    while (line != null) {
//		        sb.append(line);
//		        sb.append(System.lineSeparator());
//		    }
//		    System.out.print(str);
//		    String everything = sb.toString();
//		    itemList = everything.split("\\s+");
//		    for (int i=0; i < itemList.length; i++){
//		    	System.out.print(itemList[i] + "\\n");
//		    }
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	public static class itemSpace {
		int id;
		int num;
		public itemSpace(int id, int num){
			this.id = id;
			this.num = num;
		}
		public boolean isEmpty(){
			return (id==0) || (num==0);
		}
	}
	
	public static void getItemBox() {
		emptySpaceInItemBox = 0;
		int NumberOfBytes = 5463;
		byte[] itemBoxBytes = new byte[NumberOfBytes];
		String binStrOfItemBox = "";
		for (int i = 0; i< NumberOfBytes; i++){
			itemBoxBytes[i] = Main.buffer[Main.useroffset + Main.itemBoxOffset + i];
			String binStrOfByte = fromIntToBin((int)itemBoxBytes[i], 8);
			//System.out.println(binStrOfByte);
			binStrOfItemBox = binStrOfByte + binStrOfItemBox;
		}
		//System.out.print(Integer.parseInt("10000000", 2));
		for (int i=0; i< 2300; i++){ 
			String itemIdStr = binStrOfItemBox.substring(binStrOfItemBox.length()-12, binStrOfItemBox.length());
			String itemNumStr = binStrOfItemBox.substring(binStrOfItemBox.length()-19, binStrOfItemBox.length()-12);
			int itemId = Integer.parseInt(itemIdStr, 2);
			int itemNum = Integer.parseInt(itemNumStr, 2);
			itemBox[i] = new itemSpace(itemId, itemNum);
			//System.out.println(itemId + " " + itemNum);
			if ((itemId ==0 || itemNum==0) && emptySpaceInItemBox == 0){
				emptySpaceInItemBox = i;
			}
			binStrOfItemBox = binStrOfItemBox.substring(0, binStrOfItemBox.length()-19);
		}
		
	}
	
	public static boolean addItemToBox(int id, int num){
		if (item.emptySpaceInItemBox == 2300) {
			JOptionPane.showMessageDialog(null, "添加失败，您的物品箱子可能已满");
			return false;
		}
		if (num>99){
			boolean a = addItemToBox(id, 99);
			boolean b = addItemToBox(id, num-99);
			return a && b;
		} else {
			while (item.emptySpaceInItemBox < 2300) {
				if (item.itemBox[item.emptySpaceInItemBox].isEmpty()){
					item.itemBox[item.emptySpaceInItemBox] = new itemSpace(id, num);
					item.emptySpaceInItemBox++;
					return true;
				}
				item.emptySpaceInItemBox++;
			}
			if (item.emptySpaceInItemBox == 2300) {
				JOptionPane.showMessageDialog(null, "添加失败，您的物品箱子可能已满");
				return false;
			}
			return false;
		}
	}
	
	public static void rewriteItemBox() {
		String binStrOfItemBox = "";
		int NumberOfBytes = 5463; //5463*8 = 43704 bits  2300 * 19 = 43700 bits
		for (int i=0; i<2300; i++){ 
			int itemId = itemBox[i].id;
			int itemNum = itemBox[i].num;
			String formatedBinary = fromIntToBin(itemNum, 7) + fromIntToBin(itemId, 12);
			binStrOfItemBox = formatedBinary + binStrOfItemBox;
		}
		binStrOfItemBox = "0000" + binStrOfItemBox; //padding
		for (int i = 0; i< NumberOfBytes; i++){
			String thisBinaryStr = binStrOfItemBox.substring(binStrOfItemBox.length()-8, binStrOfItemBox.length());
			binStrOfItemBox = binStrOfItemBox.substring(0, binStrOfItemBox.length()-8);
			byte thisByte = (byte)Integer.parseInt(thisBinaryStr, 2);
			Main.buffer[Main.useroffset + Main.itemBoxOffset + i] = thisByte;
		}
		
	}
	
	public static String fromIntToBin(int i, int digit){
		String digitStr= "" + digit;
		String str = String.format("%"+ digitStr +"s", Integer.toBinaryString(i)).replace(' ', '0');
		return str.substring(str.length()-digit, str.length());
	}
	
	
	
//	public static int getIndex(String str){
//		if (itemList.length == 0)
//			return 0;
//		for (int i=0; i< itemList.length; i++){
//			if (itemList[i] == str){
//				return i;
//			}
//		}
//		return 0;
//	}
}

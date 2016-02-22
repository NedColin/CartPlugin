/*global cordova, module*/

module.exports = {
	addGoodsToCart: function(goodsName, weight, sucessCB, errorCB) {
		try {
			cordova.exec(sucessCB, errorCB, "cart", "addGoodsToCart", [goodsName]);
		} catch (e) {
			// statements
			alert(e);
		}
	}
};

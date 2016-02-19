/*global cordova, module*/

module.exports = {
    addGoodsToCart: function (goodsName,weight, sucessCB, errorCB) {
        cordova.exec(sucessCB, errorCB,[goodsName],[weight]);
    }
};

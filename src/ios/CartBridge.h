#import <Cordova/CDV.h>

@interface CartBridge : CDVPlugin

- (void)addGoodsToCart:(CDVInvokedUrlCommand *)command;

@end
#import "CartBridge.h"

@implementation CartBridge

- (void)addGoodsToCart:(CDVInvokedUrlCommand *)command
{

    NSString* msg = [NSString string]

    CDVPluginResult* result = [CDVPluginResult
                               resultWithStatus:CDVCommandStatus_OK
                               messageAsString:msg];

    [self success:result callbackId:callbackId];
}

@end
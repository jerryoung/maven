package com.jxhh.message;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class MessageTools {

    public static Boolean exec(String json,MessageHandle messageHandle){

        Gson gson = new Gson();
        MessageResultOrder messageResultOrder = null;
        MessageResultOrderAfter messageResultOrderAfter = null;
        MessageOrder messageOrder = null;
        MessageOrderAfter messageOrderAfter = null;
        MessageResultGoods messageResultGoods = null;
        MessageResultGoods.DataBean dataBeanGoods = null;

        JsonObject jsonObject = (JsonObject)new Gson().fromJson(json, JsonObject.class);
        String type = jsonObject.get("type").getAsString();
        Boolean msgBool = false;
        switch (type){

            case MessageType.AFTERSALEAGREE:
                 messageResultOrderAfter = gson.fromJson(json,MessageResultOrderAfter.class);
                 messageOrderAfter = messageResultOrderAfter.getData();
                msgBool = messageHandle.afterSaleAgree(messageOrderAfter.getAfterSaleId(),messageOrderAfter.getOrderSn(),messageOrderAfter.getSku());
                 break;
            case MessageType.AFTERSALEREFUSE:
                 messageResultOrderAfter = gson.fromJson(json,MessageResultOrderAfter.class);
                 messageOrderAfter = messageResultOrderAfter.getData();
                msgBool = messageHandle.afterSaleRefuse(messageOrderAfter.getAfterSaleId(),messageOrderAfter.getOrderSn(),messageOrderAfter.getSku());
                 break;
            case MessageType.AFTERSALESUCCESS:
                 messageResultOrderAfter = gson.fromJson(json,MessageResultOrderAfter.class);
                 messageOrderAfter = messageResultOrderAfter.getData();
                msgBool = messageHandle.afterSaleSuccess(messageOrderAfter.getAfterSaleId(),messageOrderAfter.getOrderSn(),messageOrderAfter.getSku());
                 break;
            case MessageType.GOODSALTER:
                 messageResultGoods = gson.fromJson(json,MessageResultGoods.class);
                 dataBeanGoods = messageResultGoods.getData();
                msgBool = messageHandle.goodsAlter(dataBeanGoods);
                 break;
            case MessageType.GOODSPRICEALTER:
                 messageResultGoods = gson.fromJson(json,MessageResultGoods.class);
                 dataBeanGoods = messageResultGoods.getData();
                msgBool = messageHandle.goodsPriceAlter(dataBeanGoods);
                 break;
            case MessageType.GOODSSTORAGEADD:
                 messageResultGoods = gson.fromJson(json,MessageResultGoods.class);
                 dataBeanGoods = messageResultGoods.getData();
                msgBool = messageHandle.goodsStorageAdd(dataBeanGoods);
                 break;
            case MessageType.GOODSSTORAGEDELETE:
                 messageHandle.goodsStorageDelete();
                 break;
            case MessageType.GOODSSTORAGEREMOVE:
                 messageResultGoods = gson.fromJson(json,MessageResultGoods.class);
                 dataBeanGoods = messageResultGoods.getData();
                msgBool = messageHandle.goodsStorageRemove(dataBeanGoods);
                 break;
            case MessageType.GOODSUNDERCARRIAGE:
                 messageResultGoods = gson.fromJson(json,MessageResultGoods.class);
                 dataBeanGoods = messageResultGoods.getData();
                msgBool =  messageHandle.goodsUndercarriage(dataBeanGoods);
                 break;
            case MessageType.GOODSONSALE:
                 messageResultGoods = gson.fromJson(json,MessageResultGoods.class);
                 dataBeanGoods = messageResultGoods.getData();
                msgBool =  messageHandle.goodsOnSale(dataBeanGoods);
                 break;
            case MessageType.ORDERCANCEL:
                 messageResultOrder = gson.fromJson(json,MessageResultOrder.class);
                 messageOrder = messageResultOrder.getData();
                msgBool =  messageHandle.orderCancel(messageOrder.getOrderSn(),messageOrder.getSku());
                 break;
            case MessageType.ORDERDELIVERED:
                 messageResultOrder = gson.fromJson(json,MessageResultOrder.class);
                 messageOrder = messageResultOrder.getData();
                msgBool = messageHandle.orderDelivered(messageOrder.getOrderSn(),messageOrder.getSku());
                 break;
            case MessageType.ORDERDELIVERY:
                 messageResultOrder = gson.fromJson(json,MessageResultOrder.class);
                 messageOrder = messageResultOrder.getData();
                msgBool =  messageHandle.orderDelivery(messageOrder.getOrderSn(),messageOrder.getSku());
                 break;
            case MessageType.ORDERSUCCESS:
                 messageResultOrder = gson.fromJson(json,MessageResultOrder.class);
                 messageOrder = messageResultOrder.getData();
                msgBool = messageHandle.orderSuccess(messageOrder.getOrderSn(),messageOrder.getSku());
                 break;
            default:
                break;

        }

        return msgBool;
    }


}

# RPC Redis Server Side Implementation

This is repository for Redisson RPC implementation with Spring Boot. In this example we take **User Management** try to get license from module **License Management**.

This repository contain code for **License Management**.

## Register Service

To register service into redisson instance, simply register the Service interface and the Service implementation.

```    
RRemoteService remoteService = redisson.getRemoteService();

SomeServiceImpl serviceImpl = new SomeServiceImpl();

remoteService.register(SomeService.class, serviceImpl);
```

## Testing

You need to testing it via **User Management** repository which is act as client side implementation.
# Technical Exercise

Exercise in which I Faked the process of sending Ethereum from “my wallet to some other wallet” through a post in a Rest controller.

### For running and testing the project you need:

1. Postman (or an app that posts into an URL) 
1. Ganache-cli for the fake wallet accounts

## Ganache cli

To install the ganache-cli you need nodejs and npm

```npm install -g ganache-cli```

and to run it ```ganache-cli -d``` (whithout the -d the project will not work correctly because that parameter makes the addreses and private key always the same)

## Postman
When running the project sent a POST requesto to **http://localhost:8080/send** using the Body with a raw and Json option on.

JSON:
```
{
    "receiverWallet": "0x90F8bf6A479f320ead074411a4B0e7944Ea8c9C1",
    "amount": "2"
}
```

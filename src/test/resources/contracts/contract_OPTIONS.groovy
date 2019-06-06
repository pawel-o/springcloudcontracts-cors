import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'OPTIONS'
        urlPath('/path.json')
    }
    response {
        status 200
        body(
                {}
        )
        headers {
            header('Content-Type': 'application/json')
            header('Access-Control-Allow-Origin': '*')
            header ('Access-Control-Allow-Methods': '*')
            header ('Access-Control-Allow-Headers': 'Accept, Content-Type, Content-Encoding, Server, Transfer-Encoding')
        }
    }
}
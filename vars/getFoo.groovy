import com.seemscloud.mypublicipaddress.MyPublicIPAddress

static def call() {
    return MyPublicIPAddress.getAddress()
}
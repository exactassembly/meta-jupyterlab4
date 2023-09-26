SUMMARY = "Validates fully-qualified domain names against RFC 1123, so that they are acceptable to modern bowsers"
HOMEPAGE = "https://github.com/ypcrts/fqdn"
AUTHOR = "ypcrts <ypcrts@users.noreply.github.com>"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=fa76cdee7731fb2f3726a35dfe8380b2"

SRC_URI[sha256sum] = "105ed3677e767fb5ca086a0c1f4bb66ebc3c100be518f0e0d755d9eae164d89f"

PYPI_PACKAGE = "fqdn"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = "\
"

BBCLASSEXTEND = "native nativesdk"


SUMMARY = "Python Language Server for the Language Server Protocol"
HOMEPAGE = "https://github.com/palantir/python-language-server"
AUTHOR = "Palantir Technologies, Inc."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c3c32514da3f5a5e19f5afefec549d00"

SRC_URI[sha256sum] = "9984c84a67ee2c5102c8e703215f407fcfa5e62b0ae86c9572d0ada8c4b417b0"

PYPI_PACKAGE = "python-language-server"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = "\
"

BBCLASSEXTEND = "native nativesdk"
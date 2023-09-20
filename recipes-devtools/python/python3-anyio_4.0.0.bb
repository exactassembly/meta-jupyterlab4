
SUMMARY = "High level compatibility layer for multiple asynchronous event loop implementations."
HOMEPAGE = "https://anyio.readthedocs.io/en/latest/"
AUTHOR = "Alex Grönholm <alex.gronholm@nextday.fi>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c0a769411d2af7894099e8ff75058c9f"

SRC_URI[sha256sum] = "f7ed51751b2c2add651e5747c891b47e26d2a21be5d32d9311dfe9692f3e5d7a"

PYPI_PACKAGE = "anyio"

DEPENDS += "\
    python3-setuptools-scm-native \
"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = "\
"

BBCLASSEXTEND = "native nativesdk"
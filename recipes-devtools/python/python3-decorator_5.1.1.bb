
SUMMARY = "Decorators for Humans"
HOMEPAGE = "https://github.com/micheles/decorator"
AUTHOR = "Michele Simionato <michele.simionato@gmail.com>"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=be2fd2007972bf96c08af3293d728b22"

SRC_URI[sha256sum] = "637996211036b6385ef91435e4fae22989472f9d571faba8927ba8253acbc330"

DEPENDS += "\
    python3-packaging-native \
"

PYPI_PACKAGE = "decorator"

inherit pypi setuptools3

RDEPENDS:${PN} += "\
"

BBCLASSEXTEND = "native nativesdk"
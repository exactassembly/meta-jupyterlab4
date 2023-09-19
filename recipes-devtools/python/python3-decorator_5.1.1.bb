
SUMMARY = "Decorators for Humans"
HOMEPAGE = "https://github.com/micheles/decorator"
AUTHOR = "Michele Simionato <michele.simionato@gmail.com>"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=be2fd2007972bf96c08af3293d728b22"

#SRC_URI = "https://files.pythonhosted.org/packages/66/0c/8d907af351aa16b42caae42f9d6aa37b900c67308052d10fdce809f8d952/decorator-5.1.1.tar.gz"
#SRC_URI[md5sum] = "a6b34700dcac8a4bb04efd55e99626c1"
SRC_URI[sha256sum] = "637996211036b6385ef91435e4fae22989472f9d571faba8927ba8253acbc330"

#S = "${WORKDIR}/decorator-5.1.1"

DEPENDS += "\
    python3-packaging-native \
"

PYPI_PACKAGE = "decorator"

inherit pypi setuptools3

RDEPENDS:${PN} += "\
"

BBCLASSEXTEND = "native nativesdk"
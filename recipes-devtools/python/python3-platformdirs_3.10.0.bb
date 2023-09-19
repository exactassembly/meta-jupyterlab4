
SUMMARY = "A small Python package for determining appropriate platform-specific dirs, e.g. a "user data dir"."
HOMEPAGE = "https://github.com/platformdirs/platformdirs"
AUTHOR = "Bernát Gábor <gaborjbernat@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea4f5a41454746a9ed111e3d8723d17a"

SRC_URI[sha256sum] = "b45696dab2d7cc691a3226759c0d3b00c47c8b6e293d96f6436f733303f77f6d"

PYPI_PACKAGE = "platformdirs"

DEPENDS += "\
    ${PYTHON_PN}-hatch-vcs-native \
"
inherit pypi python_hatchling

RDEPENDS:${PN} = "\
"

BBCLASSEXTEND = "native nativesdk"
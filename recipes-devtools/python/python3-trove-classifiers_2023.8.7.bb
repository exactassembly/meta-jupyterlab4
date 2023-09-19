SUMMARY = "Canonical source for classifiers on PyPI."
HOMEPAGE = "https://github.com/pypa/trove-classifiers"
AUTHOR = "The PyPI Admins<admin@pypi.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI[sha256sum] = "c9f2a0a85d545e5362e967e4f069f56fddfd91215e22ffa48c66fb283521319a"

PYPI_PACKAGE = "trove-classifiers"

DEPENDS += "\
    ${PYTHON_PN}-calver-native \
"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = ""

BBCLASSEXTEND = "native nativesdk"